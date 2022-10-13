import org.apache.commons.text.WordUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType0Font;
import org.apache.pdfbox.pdmodel.font.PDType1CFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

import java.io.IOException;
import java.util.Calendar;

public class PdfBoxExample {

    public static void writeLineText(PDPageContentStream content, int tx, int ty,
                                    PDFont font, String text) {
        if (font == null) font = PDType1Font.HELVETICA;

        try {
            content.beginText();
            content.setFont(font, 10);
            content.newLineAtOffset(tx, ty);//x: 0-595, y: 0-842
            content.showText(text);
            content.endText();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeTextColumn(PDPageContentStream content, int tx, int ty,
                                    PDFont font, String text, int wrapLength) {

        String lines[] = WordUtils.wrap(text, wrapLength).split("\\r?\\n");


        int posY = 0;
        for (int i = 0; i < lines.length; i++) {
            String line = lines[i];
            posY = ty - i * 15;

            writeLineText(content, tx, posY, font, line);
        }
    }

    public static void drawImage(PDDocument doc, PDPageContentStream content, int tx, int ty,
                                 double scaleX, double scaleY, String fileName) {
        try {
            PDImageXObject image =
                    PDImageXObject.createFromFile(fileName, doc);
            int iw = (int) (image.getWidth() * scaleX);
            int ih = (int) (image.getHeight() * scaleY);
            content.drawImage(image, tx, ty, iw,ih);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {

        Calendar c = Calendar.getInstance();
        String fileName = "files/file_" + c.get(Calendar.HOUR_OF_DAY)
                + "_" + c.get(Calendar.MINUTE) + ".pdf";

        PDDocument document = new PDDocument();
        PDPage page1 = new PDPage();
        document.addPage(page1);

        PDPageContentStream content = new PDPageContentStream(document,page1);

        writeLineText(content, 40, 100, null, "Hello World");

        writeTextColumn(content, 40, 700, null, "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
                50);
        writeTextColumn(content, 280, 700, null, "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
                50);

        drawImage(document, content, 40, 120, 0.3, 0.3,
                "files/imgl.jpg");

        content.close();



        //nowa strona
        PDPage page2 = new PDPage();
        PDPageContentStream content2 = new PDPageContentStream(document, page2);
        document.addPage(page2);
        writeLineText(content2,40,700,PDType1Font.COURIER_BOLD,"Hello world");

        content2.close();
        document.save(fileName);
        document.close();
    }
}
