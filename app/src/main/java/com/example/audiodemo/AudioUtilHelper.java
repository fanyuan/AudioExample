package com.example.audiodemo;

import com.example.audiodemo.cut.AudioCutUtil;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class AudioUtilHelper {
    /**
     * 音频合成功能
     * @param path1 音频文件输入路径
     * @param path2 音频文件输入路径
     * @param outPath 合成后的结果文件路径
     * @param progress1 音量比值
     * @param progress2 音量比值
     */
    public static void mixAudio(String path1, String path2, String outPath,float progress1, float progress2){
        MixAudioUtil.mixAudio(path1,path2,outPath,progress1,progress2);
    }
    /**
     * 音频合成功能
     * @param path1 音频文件输入路径
     * @param path2 音频文件输入路径
     * @param outPath 合成后的结果文件路径
     * @param progress1 音量比值
     * @param progress2 音量比值
     * @param callback   音频合成功能回调
     */
    public static void mixAudio(String path1, String path2, String outPath, float progress1, float progress2, MixAudioUtil.MixAudioCallback callback){
        MixAudioUtil.mixAudio(path1,path2,outPath,progress1,progress2,callback);
    }
    /**
     * 拼接wav音频的文件
     * @param inputs
     * @param output
     * @throws IOException
     */
    public static void mergeWav(List<File> inputs, File output) throws IOException {
        WavMergeUtil.mergeWav(inputs,output);
    }
    /**
     * 裁剪音频功能
     * @param srcPath 源音频路径
     * @param destPath 目标音频路径
     * @param startTime 裁剪开始时间
     * @param endTime 裁剪结束时间
     */
    public static void cutAudio(String srcPath,String destPath, float startTime, float endTime){
        AudioCutUtil.cutAudio(srcPath,destPath,startTime,endTime);
    }

    /**
     *  裁剪音频功能
     * @param srcPath 源音频路径
     *@param destPath 目标音频路径
     *@param startTime 裁剪开始时间
     * @param endTime 裁剪结束时间
     * @param callback 音频裁剪回调
     */
    public static void cutAudio(String srcPath, String destPath, float startTime, float endTime, AudioCutUtil.AudioCutCallback callback){
        AudioCutUtil.cutAudio(srcPath,destPath,startTime,endTime,callback);
    }
}
