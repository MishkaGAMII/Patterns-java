public class Main {

    public static void main(String[] args) {
        String fileName = "youtubevideo.ogg";

        VideoFile videoFile = new VideoFile(
            fileName,
            new Buffer("Byte buffer of video"),
            new Buffer("Byte buffer of audio")
        );

        VideoConversionFacade videoConversionFacade = new VideoConversionFacade();
        VideoFile convertedVideoFile = videoConversionFacade.convert(videoFile, new MPEG4CompressionCodec());

        convertedVideoFile.play();
    }
}
