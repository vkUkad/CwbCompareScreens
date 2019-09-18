package Helpers;

import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageOutputStream;
import javax.imageio.stream.ImageOutputStream;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CreateGif {
    public static void createGifFile(String firstFile, String secondFile, String outputFile) throws Exception, IOException {
        BufferedImage first = ImageIO.read(new File(firstFile));
        ImageOutputStream output = new FileImageOutputStream(new File(outputFile));

        GifSequenceWriter writer = new GifSequenceWriter(output, first.getType(), 250, true);
        writer.writeToSequence(first);

        File[] images = new File[]{
                new File(firstFile),
                new File(secondFile),
        };

        for (File image : images) {
            BufferedImage next = ImageIO.read(image);
            writer.writeToSequence(next);
        }

        writer.close();
        output.close();
    }
}
