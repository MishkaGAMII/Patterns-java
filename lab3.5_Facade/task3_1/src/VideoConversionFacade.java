/**
 * Фасад для спрощення процесу конвертації відео.
 * Приховує складну послідовність роботи з кодеками,
 * зчитуванням бітрейту та виправленням аудіодоріжки.
 */
public class VideoConversionFacade {

    /**
     * Конвертує відеофайл у формат, що задається кодеком призначення.
     *
     * @param file  відеофайл, який необхідно конвертувати
     * @param codec кодек цільового формату
     * @return новий відеофайл у потрібному форматі
     */
    public VideoFile convert(VideoFile file, Codec codec) {
        System.out.println("\n======= VideoConversionFacade: conversion started. =======");

        Codec sourceCodec = CodecFactory.extract(file);
        Buffer buffer = BitrateReader.read(file, sourceCodec);
        VideoFile convertedVideoFile = BitrateReader.convert(buffer, file.getName(), codec);

        AudioMixer audioMixer = new AudioMixer();
        audioMixer.fix(convertedVideoFile, file.getAudioBuffer());

        System.out.println("====== VideoConversionFacade: conversion completed =======\n");
        return convertedVideoFile;
    }
}
