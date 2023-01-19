package tech.tresearchgroup.schemas.galago.entities;

import tech.tresearchgroup.dao.model.DatabaseTypeEnum;
import tech.tresearchgroup.palila.model.BaseSettings;
import tech.tresearchgroup.palila.model.enums.PlaybackQualityEnum;
import tech.tresearchgroup.schemas.galago.enums.*;

public class SettingsEntity extends BaseSettings {
    public static InterfaceMethodEnum interfaceMethod;
    public static PlaybackQualityEnum defaultPlaybackQuality;
    public static DisplayModeEnum displayMode;
    public static EncoderProgramEnum encoderProgram;
    public static InspectorProgramEnum inspectorProgram;
    public static AudioCodecEnum audioCodec;
    public static AudioRateEnum audioRate;
    public static EncoderPresetEnum audioPreset;
    public static VideoContainerEnum videoContainer;
    public static VideoCodecEnum videoCodec;
    public static EncoderPresetEnum encoderPreset;
    public static boolean videoTuneFilm;
    public static boolean videoTuneAnimation;
    public static boolean videoTuneGrain;
    public static boolean videoTuneStillImage;
    public static boolean videoTuneFastDecode;
    public static boolean videoTuneZeroLatency;
    public static boolean videoFastStart;
    public static boolean videoTunePsnr;
    public static boolean videoTuneSsnr;

    public static int videoCrf;
    public static boolean videoBlackBorder;
    public static boolean videoCudaAcceleration;

    public static int oneFourFourVideoTranscodeBitrate;

    public static int twoFourZeroVideoTranscodeBitrate;

    public static int threeSixZeroVideoTranscodeBitrate;

    public static int fourEightZeroVideoTranscodeBitrate;

    public static int sevenTwoZeroVideoTranscodeBitrate;

    public static int oneZeroEightZeroVideoTranscodeBitrate;

    public static int twoKVideoTranscodeBitrate;

    public static int fourKVideoTranscodeBitrate;

    public static int eightKVideoTranscodeBitrate;
    public static boolean tableShowPoster;
    public static boolean tableShowName;
    public static boolean tableShowRuntime;
    public static boolean tableShowGenre;
    public static boolean tableShowMpaaRating;
    public static boolean tableShowUserRating;
    public static boolean tableShowLanguage;
    public static boolean tableShowReleaseDate;
    public static boolean tableShowActions;
    public static boolean bookLibraryEnable;
    public static String bookLibraryPath;
    public static boolean bookScanEnable;

    public static int bookScanFrequencyTime;
    public static ScanFrequencyEnum bookScanFrequencyType;
    public static boolean gameLibraryEnable;
    public static String gameLibraryPath;
    public static boolean gameScanEnable;

    public static int gameScanFrequencyTime;
    public static ScanFrequencyEnum gameScanFrequencyType;
    public static boolean movieLibraryEnable;
    public static String movieLibraryPath;
    public static boolean movieScanEnable;
    public static boolean moviePreTranscodeEnable;
    public static boolean moviePreTranscode144p;
    public static boolean moviePreTranscode240p;
    public static boolean moviePreTranscode360p;
    public static boolean moviePreTranscode480p;
    public static boolean moviePreTranscode720p;
    public static boolean moviePreTranscode1080p;
    public static boolean moviePreTranscode2k;
    public static boolean moviePreTranscode4k;
    public static boolean moviePreTranscode8k;

    public static int movieScanFrequencyTime;
    public static ScanFrequencyEnum movieScanFrequencyType;
    public static String moviePreTranscodeLibraryPath;
    public static boolean musicLibraryEnable;
    public static String musicLibraryPath;
    public static boolean musicScanEnable;
    public static boolean musicPreTranscodeEnable;
    public static boolean musicPreTranscode64k;
    public static boolean musicPreTranscode96k;
    public static boolean musicPreTranscode128k;
    public static boolean musicPreTranscode320k;
    public static boolean musicPreTranscode1411k;

    public static int musicScanFrequencyTime;
    public static ScanFrequencyEnum musicScanFrequencyType;
    public static String musicPreTranscodeLibraryPath;
    public static boolean tvShowLibraryEnable;
    public static String tvShowLibraryPath;
    public static boolean tvShowScanEnable;
    public static boolean tvShowPreTranscodeEnable;
    public static boolean tvShowPreTranscode144p;
    public static boolean tvShowPreTranscode240p;
    public static boolean tvShowPreTranscode360p;
    public static boolean tvShowPreTranscode480p;
    public static boolean tvShowPreTranscode720p;
    public static boolean tvShowPreTranscode1080p;
    public static boolean tvShowPreTranscode2k;
    public static boolean tvShowPreTranscode4k;
    public static boolean tvShowPreTranscode8k;

    public static int tvShowScanFrequencyTime;
    public static ScanFrequencyEnum tvShowScanFrequencyType;
    public static String tvShowPreTranscodeLibraryPath;
    public static boolean allowRegistration;
    public static boolean homePageShowNewMovie;
    public static boolean homePageShowNewTvShow;
    public static boolean homePageShowNewGame;
    public static boolean homePageShowNewBook;
    public static boolean homePageShowNewMusic;
    public static boolean homePageShowPopularMovie;
    public static boolean homePageShowPopularTvShow;
    public static boolean homePageShowPopularGame;
    public static boolean homePageShowPopularBook;
    public static boolean homePageShowPopularMusic;
    public static boolean stickyTopMenu;
    public static String databaseName;
    public static int minDatabaseConnections;
    public static int maxDatabaseConnections;
    public static String[] entityPackages;
    public static boolean enableHistory;
    public static boolean enableUpload;
    public static String profilePhotoFolder;
    public static int chunk = 1024 * 2048;

    public static InterfaceMethodEnum getInterfaceMethod() {
        return interfaceMethod;
    }

    public static void setInterfaceMethod(InterfaceMethodEnum interfaceMethod) {
        SettingsEntity.interfaceMethod = interfaceMethod;
    }

    public static PlaybackQualityEnum getDefaultPlaybackQuality() {
        return defaultPlaybackQuality;
    }

    public static void setDefaultPlaybackQuality(PlaybackQualityEnum defaultPlaybackQuality) {
        SettingsEntity.defaultPlaybackQuality = defaultPlaybackQuality;
    }

    public static DisplayModeEnum getDisplayMode() {
        return displayMode;
    }

    public static void setDisplayMode(DisplayModeEnum displayMode) {
        SettingsEntity.displayMode = displayMode;
    }

    public static EncoderProgramEnum getEncoderProgram() {
        return encoderProgram;
    }

    public static void setEncoderProgram(EncoderProgramEnum encoderProgram) {
        SettingsEntity.encoderProgram = encoderProgram;
    }

    public static InspectorProgramEnum getInspectorProgram() {
        return inspectorProgram;
    }

    public static void setInspectorProgram(InspectorProgramEnum inspectorProgram) {
        SettingsEntity.inspectorProgram = inspectorProgram;
    }

    public static AudioCodecEnum getAudioCodec() {
        return audioCodec;
    }

    public static void setAudioCodec(AudioCodecEnum audioCodec) {
        SettingsEntity.audioCodec = audioCodec;
    }

    public static AudioRateEnum getAudioRate() {
        return audioRate;
    }

    public static void setAudioRate(AudioRateEnum audioRate) {
        SettingsEntity.audioRate = audioRate;
    }

    public static EncoderPresetEnum getAudioPreset() {
        return audioPreset;
    }

    public static void setAudioPreset(EncoderPresetEnum audioPreset) {
        SettingsEntity.audioPreset = audioPreset;
    }

    public static VideoContainerEnum getVideoContainer() {
        return videoContainer;
    }

    public static void setVideoContainer(VideoContainerEnum videoContainer) {
        SettingsEntity.videoContainer = videoContainer;
    }

    public static VideoCodecEnum getVideoCodec() {
        return videoCodec;
    }

    public static void setVideoCodec(VideoCodecEnum videoCodec) {
        SettingsEntity.videoCodec = videoCodec;
    }

    public static EncoderPresetEnum getEncoderPreset() {
        return encoderPreset;
    }

    public static void setEncoderPreset(EncoderPresetEnum encoderPreset) {
        SettingsEntity.encoderPreset = encoderPreset;
    }

    public static boolean isVideoTuneFilm() {
        return videoTuneFilm;
    }

    public static void setVideoTuneFilm(boolean videoTuneFilm) {
        SettingsEntity.videoTuneFilm = videoTuneFilm;
    }

    public static boolean isVideoTuneAnimation() {
        return videoTuneAnimation;
    }

    public static void setVideoTuneAnimation(boolean videoTuneAnimation) {
        SettingsEntity.videoTuneAnimation = videoTuneAnimation;
    }

    public static boolean isVideoTuneGrain() {
        return videoTuneGrain;
    }

    public static void setVideoTuneGrain(boolean videoTuneGrain) {
        SettingsEntity.videoTuneGrain = videoTuneGrain;
    }

    public static boolean isVideoTuneStillImage() {
        return videoTuneStillImage;
    }

    public static void setVideoTuneStillImage(boolean videoTuneStillImage) {
        SettingsEntity.videoTuneStillImage = videoTuneStillImage;
    }

    public static boolean isVideoTuneFastDecode() {
        return videoTuneFastDecode;
    }

    public static void setVideoTuneFastDecode(boolean videoTuneFastDecode) {
        SettingsEntity.videoTuneFastDecode = videoTuneFastDecode;
    }

    public static boolean isVideoTuneZeroLatency() {
        return videoTuneZeroLatency;
    }

    public static void setVideoTuneZeroLatency(boolean videoTuneZeroLatency) {
        SettingsEntity.videoTuneZeroLatency = videoTuneZeroLatency;
    }

    public static boolean isVideoFastStart() {
        return videoFastStart;
    }

    public static void setVideoFastStart(boolean videoFastStart) {
        SettingsEntity.videoFastStart = videoFastStart;
    }

    public static boolean isVideoTunePsnr() {
        return videoTunePsnr;
    }

    public static void setVideoTunePsnr(boolean videoTunePsnr) {
        SettingsEntity.videoTunePsnr = videoTunePsnr;
    }

    public static boolean isVideoTuneSsnr() {
        return videoTuneSsnr;
    }

    public static void setVideoTuneSsnr(boolean videoTuneSsnr) {
        SettingsEntity.videoTuneSsnr = videoTuneSsnr;
    }

    public static int getVideoCrf() {
        return videoCrf;
    }

    public static void setVideoCrf(int videoCrf) {
        SettingsEntity.videoCrf = videoCrf;
    }

    public static boolean isVideoBlackBorder() {
        return videoBlackBorder;
    }

    public static void setVideoBlackBorder(boolean videoBlackBorder) {
        SettingsEntity.videoBlackBorder = videoBlackBorder;
    }

    public static boolean isVideoCudaAcceleration() {
        return videoCudaAcceleration;
    }

    public static void setVideoCudaAcceleration(boolean videoCudaAcceleration) {
        SettingsEntity.videoCudaAcceleration = videoCudaAcceleration;
    }

    public static int getOneFourFourVideoTranscodeBitrate() {
        return oneFourFourVideoTranscodeBitrate;
    }

    public static void setOneFourFourVideoTranscodeBitrate(int oneFourFourVideoTranscodeBitrate) {
        SettingsEntity.oneFourFourVideoTranscodeBitrate = oneFourFourVideoTranscodeBitrate;
    }

    public static int getTwoFourZeroVideoTranscodeBitrate() {
        return twoFourZeroVideoTranscodeBitrate;
    }

    public static void setTwoFourZeroVideoTranscodeBitrate(int twoFourZeroVideoTranscodeBitrate) {
        SettingsEntity.twoFourZeroVideoTranscodeBitrate = twoFourZeroVideoTranscodeBitrate;
    }

    public static int getThreeSixZeroVideoTranscodeBitrate() {
        return threeSixZeroVideoTranscodeBitrate;
    }

    public static void setThreeSixZeroVideoTranscodeBitrate(int threeSixZeroVideoTranscodeBitrate) {
        SettingsEntity.threeSixZeroVideoTranscodeBitrate = threeSixZeroVideoTranscodeBitrate;
    }

    public static int getFourEightZeroVideoTranscodeBitrate() {
        return fourEightZeroVideoTranscodeBitrate;
    }

    public static void setFourEightZeroVideoTranscodeBitrate(int fourEightZeroVideoTranscodeBitrate) {
        SettingsEntity.fourEightZeroVideoTranscodeBitrate = fourEightZeroVideoTranscodeBitrate;
    }

    public static int getSevenTwoZeroVideoTranscodeBitrate() {
        return sevenTwoZeroVideoTranscodeBitrate;
    }

    public static void setSevenTwoZeroVideoTranscodeBitrate(int sevenTwoZeroVideoTranscodeBitrate) {
        SettingsEntity.sevenTwoZeroVideoTranscodeBitrate = sevenTwoZeroVideoTranscodeBitrate;
    }

    public static int getOneZeroEightZeroVideoTranscodeBitrate() {
        return oneZeroEightZeroVideoTranscodeBitrate;
    }

    public static void setOneZeroEightZeroVideoTranscodeBitrate(int oneZeroEightZeroVideoTranscodeBitrate) {
        SettingsEntity.oneZeroEightZeroVideoTranscodeBitrate = oneZeroEightZeroVideoTranscodeBitrate;
    }

    public static int getTwoKVideoTranscodeBitrate() {
        return twoKVideoTranscodeBitrate;
    }

    public static void setTwoKVideoTranscodeBitrate(int twoKVideoTranscodeBitrate) {
        SettingsEntity.twoKVideoTranscodeBitrate = twoKVideoTranscodeBitrate;
    }

    public static int getFourKVideoTranscodeBitrate() {
        return fourKVideoTranscodeBitrate;
    }

    public static void setFourKVideoTranscodeBitrate(int fourKVideoTranscodeBitrate) {
        SettingsEntity.fourKVideoTranscodeBitrate = fourKVideoTranscodeBitrate;
    }

    public static int getEightKVideoTranscodeBitrate() {
        return eightKVideoTranscodeBitrate;
    }

    public static void setEightKVideoTranscodeBitrate(int eightKVideoTranscodeBitrate) {
        SettingsEntity.eightKVideoTranscodeBitrate = eightKVideoTranscodeBitrate;
    }

    public static boolean isTableShowPoster() {
        return tableShowPoster;
    }

    public static void setTableShowPoster(boolean tableShowPoster) {
        SettingsEntity.tableShowPoster = tableShowPoster;
    }

    public static boolean isTableShowName() {
        return tableShowName;
    }

    public static void setTableShowName(boolean tableShowName) {
        SettingsEntity.tableShowName = tableShowName;
    }

    public static boolean isTableShowRuntime() {
        return tableShowRuntime;
    }

    public static void setTableShowRuntime(boolean tableShowRuntime) {
        SettingsEntity.tableShowRuntime = tableShowRuntime;
    }

    public static boolean isTableShowGenre() {
        return tableShowGenre;
    }

    public static void setTableShowGenre(boolean tableShowGenre) {
        SettingsEntity.tableShowGenre = tableShowGenre;
    }

    public static boolean isTableShowMpaaRating() {
        return tableShowMpaaRating;
    }

    public static void setTableShowMpaaRating(boolean tableShowMpaaRating) {
        SettingsEntity.tableShowMpaaRating = tableShowMpaaRating;
    }

    public static boolean isTableShowUserRating() {
        return tableShowUserRating;
    }

    public static void setTableShowUserRating(boolean tableShowUserRating) {
        SettingsEntity.tableShowUserRating = tableShowUserRating;
    }

    public static boolean isTableShowLanguage() {
        return tableShowLanguage;
    }

    public static void setTableShowLanguage(boolean tableShowLanguage) {
        SettingsEntity.tableShowLanguage = tableShowLanguage;
    }

    public static boolean isTableShowReleaseDate() {
        return tableShowReleaseDate;
    }

    public static void setTableShowReleaseDate(boolean tableShowReleaseDate) {
        SettingsEntity.tableShowReleaseDate = tableShowReleaseDate;
    }

    public static boolean isTableShowActions() {
        return tableShowActions;
    }

    public static void setTableShowActions(boolean tableShowActions) {
        SettingsEntity.tableShowActions = tableShowActions;
    }

    public static boolean isBookLibraryEnable() {
        return bookLibraryEnable;
    }

    public static void setBookLibraryEnable(boolean bookLibraryEnable) {
        SettingsEntity.bookLibraryEnable = bookLibraryEnable;
    }

    public static String getBookLibraryPath() {
        return bookLibraryPath;
    }

    public static void setBookLibraryPath(String bookLibraryPath) {
        SettingsEntity.bookLibraryPath = bookLibraryPath;
    }

    public static boolean isBookScanEnable() {
        return bookScanEnable;
    }

    public static void setBookScanEnable(boolean bookScanEnable) {
        SettingsEntity.bookScanEnable = bookScanEnable;
    }

    public static int getBookScanFrequencyTime() {
        return bookScanFrequencyTime;
    }

    public static void setBookScanFrequencyTime(int bookScanFrequencyTime) {
        SettingsEntity.bookScanFrequencyTime = bookScanFrequencyTime;
    }

    public static ScanFrequencyEnum getBookScanFrequencyType() {
        return bookScanFrequencyType;
    }

    public static void setBookScanFrequencyType(ScanFrequencyEnum bookScanFrequencyType) {
        SettingsEntity.bookScanFrequencyType = bookScanFrequencyType;
    }

    public static boolean isGameLibraryEnable() {
        return gameLibraryEnable;
    }

    public static void setGameLibraryEnable(boolean gameLibraryEnable) {
        SettingsEntity.gameLibraryEnable = gameLibraryEnable;
    }

    public static String getGameLibraryPath() {
        return gameLibraryPath;
    }

    public static void setGameLibraryPath(String gameLibraryPath) {
        SettingsEntity.gameLibraryPath = gameLibraryPath;
    }

    public static boolean isGameScanEnable() {
        return gameScanEnable;
    }

    public static void setGameScanEnable(boolean gameScanEnable) {
        SettingsEntity.gameScanEnable = gameScanEnable;
    }

    public static int getGameScanFrequencyTime() {
        return gameScanFrequencyTime;
    }

    public static void setGameScanFrequencyTime(int gameScanFrequencyTime) {
        SettingsEntity.gameScanFrequencyTime = gameScanFrequencyTime;
    }

    public static ScanFrequencyEnum getGameScanFrequencyType() {
        return gameScanFrequencyType;
    }

    public static void setGameScanFrequencyType(ScanFrequencyEnum gameScanFrequencyType) {
        SettingsEntity.gameScanFrequencyType = gameScanFrequencyType;
    }

    public static boolean isMovieLibraryEnable() {
        return movieLibraryEnable;
    }

    public static void setMovieLibraryEnable(boolean movieLibraryEnable) {
        SettingsEntity.movieLibraryEnable = movieLibraryEnable;
    }

    public static String getMovieLibraryPath() {
        return movieLibraryPath;
    }

    public static void setMovieLibraryPath(String movieLibraryPath) {
        SettingsEntity.movieLibraryPath = movieLibraryPath;
    }

    public static boolean isMovieScanEnable() {
        return movieScanEnable;
    }

    public static void setMovieScanEnable(boolean movieScanEnable) {
        SettingsEntity.movieScanEnable = movieScanEnable;
    }

    public static boolean isMoviePreTranscodeEnable() {
        return moviePreTranscodeEnable;
    }

    public static void setMoviePreTranscodeEnable(boolean moviePreTranscodeEnable) {
        SettingsEntity.moviePreTranscodeEnable = moviePreTranscodeEnable;
    }

    public static boolean isMoviePreTranscode144p() {
        return moviePreTranscode144p;
    }

    public static void setMoviePreTranscode144p(boolean moviePreTranscode144p) {
        SettingsEntity.moviePreTranscode144p = moviePreTranscode144p;
    }

    public static boolean isMoviePreTranscode240p() {
        return moviePreTranscode240p;
    }

    public static void setMoviePreTranscode240p(boolean moviePreTranscode240p) {
        SettingsEntity.moviePreTranscode240p = moviePreTranscode240p;
    }

    public static boolean isMoviePreTranscode360p() {
        return moviePreTranscode360p;
    }

    public static void setMoviePreTranscode360p(boolean moviePreTranscode360p) {
        SettingsEntity.moviePreTranscode360p = moviePreTranscode360p;
    }

    public static boolean isMoviePreTranscode480p() {
        return moviePreTranscode480p;
    }

    public static void setMoviePreTranscode480p(boolean moviePreTranscode480p) {
        SettingsEntity.moviePreTranscode480p = moviePreTranscode480p;
    }

    public static boolean isMoviePreTranscode720p() {
        return moviePreTranscode720p;
    }

    public static void setMoviePreTranscode720p(boolean moviePreTranscode720p) {
        SettingsEntity.moviePreTranscode720p = moviePreTranscode720p;
    }

    public static boolean isMoviePreTranscode1080p() {
        return moviePreTranscode1080p;
    }

    public static void setMoviePreTranscode1080p(boolean moviePreTranscode1080p) {
        SettingsEntity.moviePreTranscode1080p = moviePreTranscode1080p;
    }

    public static boolean isMoviePreTranscode2k() {
        return moviePreTranscode2k;
    }

    public static void setMoviePreTranscode2k(boolean moviePreTranscode2k) {
        SettingsEntity.moviePreTranscode2k = moviePreTranscode2k;
    }

    public static boolean isMoviePreTranscode4k() {
        return moviePreTranscode4k;
    }

    public static void setMoviePreTranscode4k(boolean moviePreTranscode4k) {
        SettingsEntity.moviePreTranscode4k = moviePreTranscode4k;
    }

    public static boolean isMoviePreTranscode8k() {
        return moviePreTranscode8k;
    }

    public static void setMoviePreTranscode8k(boolean moviePreTranscode8k) {
        SettingsEntity.moviePreTranscode8k = moviePreTranscode8k;
    }

    public static int getMovieScanFrequencyTime() {
        return movieScanFrequencyTime;
    }

    public static void setMovieScanFrequencyTime(int movieScanFrequencyTime) {
        SettingsEntity.movieScanFrequencyTime = movieScanFrequencyTime;
    }

    public static ScanFrequencyEnum getMovieScanFrequencyType() {
        return movieScanFrequencyType;
    }

    public static void setMovieScanFrequencyType(ScanFrequencyEnum movieScanFrequencyType) {
        SettingsEntity.movieScanFrequencyType = movieScanFrequencyType;
    }

    public static String getMoviePreTranscodeLibraryPath() {
        return moviePreTranscodeLibraryPath;
    }

    public static void setMoviePreTranscodeLibraryPath(String moviePreTranscodeLibraryPath) {
        SettingsEntity.moviePreTranscodeLibraryPath = moviePreTranscodeLibraryPath;
    }

    public static boolean isMusicLibraryEnable() {
        return musicLibraryEnable;
    }

    public static void setMusicLibraryEnable(boolean musicLibraryEnable) {
        SettingsEntity.musicLibraryEnable = musicLibraryEnable;
    }

    public static String getMusicLibraryPath() {
        return musicLibraryPath;
    }

    public static void setMusicLibraryPath(String musicLibraryPath) {
        SettingsEntity.musicLibraryPath = musicLibraryPath;
    }

    public static boolean isMusicScanEnable() {
        return musicScanEnable;
    }

    public static void setMusicScanEnable(boolean musicScanEnable) {
        SettingsEntity.musicScanEnable = musicScanEnable;
    }

    public static boolean isMusicPreTranscodeEnable() {
        return musicPreTranscodeEnable;
    }

    public static void setMusicPreTranscodeEnable(boolean musicPreTranscodeEnable) {
        SettingsEntity.musicPreTranscodeEnable = musicPreTranscodeEnable;
    }

    public static boolean isMusicPreTranscode64k() {
        return musicPreTranscode64k;
    }

    public static void setMusicPreTranscode64k(boolean musicPreTranscode64k) {
        SettingsEntity.musicPreTranscode64k = musicPreTranscode64k;
    }

    public static boolean isMusicPreTranscode96k() {
        return musicPreTranscode96k;
    }

    public static void setMusicPreTranscode96k(boolean musicPreTranscode96k) {
        SettingsEntity.musicPreTranscode96k = musicPreTranscode96k;
    }

    public static boolean isMusicPreTranscode128k() {
        return musicPreTranscode128k;
    }

    public static void setMusicPreTranscode128k(boolean musicPreTranscode128k) {
        SettingsEntity.musicPreTranscode128k = musicPreTranscode128k;
    }

    public static boolean isMusicPreTranscode320k() {
        return musicPreTranscode320k;
    }

    public static void setMusicPreTranscode320k(boolean musicPreTranscode320k) {
        SettingsEntity.musicPreTranscode320k = musicPreTranscode320k;
    }

    public static boolean isMusicPreTranscode1411k() {
        return musicPreTranscode1411k;
    }

    public static void setMusicPreTranscode1411k(boolean musicPreTranscode1411k) {
        SettingsEntity.musicPreTranscode1411k = musicPreTranscode1411k;
    }

    public static int getMusicScanFrequencyTime() {
        return musicScanFrequencyTime;
    }

    public static void setMusicScanFrequencyTime(int musicScanFrequencyTime) {
        SettingsEntity.musicScanFrequencyTime = musicScanFrequencyTime;
    }

    public static ScanFrequencyEnum getMusicScanFrequencyType() {
        return musicScanFrequencyType;
    }

    public static void setMusicScanFrequencyType(ScanFrequencyEnum musicScanFrequencyType) {
        SettingsEntity.musicScanFrequencyType = musicScanFrequencyType;
    }

    public static String getMusicPreTranscodeLibraryPath() {
        return musicPreTranscodeLibraryPath;
    }

    public static void setMusicPreTranscodeLibraryPath(String musicPreTranscodeLibraryPath) {
        SettingsEntity.musicPreTranscodeLibraryPath = musicPreTranscodeLibraryPath;
    }

    public static boolean isTvShowLibraryEnable() {
        return tvShowLibraryEnable;
    }

    public static void setTvShowLibraryEnable(boolean tvShowLibraryEnable) {
        SettingsEntity.tvShowLibraryEnable = tvShowLibraryEnable;
    }

    public static String getTvShowLibraryPath() {
        return tvShowLibraryPath;
    }

    public static void setTvShowLibraryPath(String tvShowLibraryPath) {
        SettingsEntity.tvShowLibraryPath = tvShowLibraryPath;
    }

    public static boolean isTvShowScanEnable() {
        return tvShowScanEnable;
    }

    public static void setTvShowScanEnable(boolean tvShowScanEnable) {
        SettingsEntity.tvShowScanEnable = tvShowScanEnable;
    }

    public static boolean isTvShowPreTranscodeEnable() {
        return tvShowPreTranscodeEnable;
    }

    public static void setTvShowPreTranscodeEnable(boolean tvShowPreTranscodeEnable) {
        SettingsEntity.tvShowPreTranscodeEnable = tvShowPreTranscodeEnable;
    }

    public static boolean isTvShowPreTranscode144p() {
        return tvShowPreTranscode144p;
    }

    public static void setTvShowPreTranscode144p(boolean tvShowPreTranscode144p) {
        SettingsEntity.tvShowPreTranscode144p = tvShowPreTranscode144p;
    }

    public static boolean isTvShowPreTranscode240p() {
        return tvShowPreTranscode240p;
    }

    public static void setTvShowPreTranscode240p(boolean tvShowPreTranscode240p) {
        SettingsEntity.tvShowPreTranscode240p = tvShowPreTranscode240p;
    }

    public static boolean isTvShowPreTranscode360p() {
        return tvShowPreTranscode360p;
    }

    public static void setTvShowPreTranscode360p(boolean tvShowPreTranscode360p) {
        SettingsEntity.tvShowPreTranscode360p = tvShowPreTranscode360p;
    }

    public static boolean isTvShowPreTranscode480p() {
        return tvShowPreTranscode480p;
    }

    public static void setTvShowPreTranscode480p(boolean tvShowPreTranscode480p) {
        SettingsEntity.tvShowPreTranscode480p = tvShowPreTranscode480p;
    }

    public static boolean isTvShowPreTranscode720p() {
        return tvShowPreTranscode720p;
    }

    public static void setTvShowPreTranscode720p(boolean tvShowPreTranscode720p) {
        SettingsEntity.tvShowPreTranscode720p = tvShowPreTranscode720p;
    }

    public static boolean isTvShowPreTranscode1080p() {
        return tvShowPreTranscode1080p;
    }

    public static void setTvShowPreTranscode1080p(boolean tvShowPreTranscode1080p) {
        SettingsEntity.tvShowPreTranscode1080p = tvShowPreTranscode1080p;
    }

    public static boolean isTvShowPreTranscode2k() {
        return tvShowPreTranscode2k;
    }

    public static void setTvShowPreTranscode2k(boolean tvShowPreTranscode2k) {
        SettingsEntity.tvShowPreTranscode2k = tvShowPreTranscode2k;
    }

    public static boolean isTvShowPreTranscode4k() {
        return tvShowPreTranscode4k;
    }

    public static void setTvShowPreTranscode4k(boolean tvShowPreTranscode4k) {
        SettingsEntity.tvShowPreTranscode4k = tvShowPreTranscode4k;
    }

    public static boolean isTvShowPreTranscode8k() {
        return tvShowPreTranscode8k;
    }

    public static void setTvShowPreTranscode8k(boolean tvShowPreTranscode8k) {
        SettingsEntity.tvShowPreTranscode8k = tvShowPreTranscode8k;
    }

    public static int getTvShowScanFrequencyTime() {
        return tvShowScanFrequencyTime;
    }

    public static void setTvShowScanFrequencyTime(int tvShowScanFrequencyTime) {
        SettingsEntity.tvShowScanFrequencyTime = tvShowScanFrequencyTime;
    }

    public static ScanFrequencyEnum getTvShowScanFrequencyType() {
        return tvShowScanFrequencyType;
    }

    public static void setTvShowScanFrequencyType(ScanFrequencyEnum tvShowScanFrequencyType) {
        SettingsEntity.tvShowScanFrequencyType = tvShowScanFrequencyType;
    }

    public static String getTvShowPreTranscodeLibraryPath() {
        return tvShowPreTranscodeLibraryPath;
    }

    public static void setTvShowPreTranscodeLibraryPath(String tvShowPreTranscodeLibraryPath) {
        SettingsEntity.tvShowPreTranscodeLibraryPath = tvShowPreTranscodeLibraryPath;
    }

    public static boolean isAllowRegistration() {
        return allowRegistration;
    }

    public static void setAllowRegistration(boolean allowRegistration) {
        SettingsEntity.allowRegistration = allowRegistration;
    }

    public static boolean isHomePageShowNewMovie() {
        return homePageShowNewMovie;
    }

    public static void setHomePageShowNewMovie(boolean homePageShowNewMovie) {
        SettingsEntity.homePageShowNewMovie = homePageShowNewMovie;
    }

    public static boolean isHomePageShowNewTvShow() {
        return homePageShowNewTvShow;
    }

    public static void setHomePageShowNewTvShow(boolean homePageShowNewTvShow) {
        SettingsEntity.homePageShowNewTvShow = homePageShowNewTvShow;
    }

    public static boolean isHomePageShowNewGame() {
        return homePageShowNewGame;
    }

    public static void setHomePageShowNewGame(boolean homePageShowNewGame) {
        SettingsEntity.homePageShowNewGame = homePageShowNewGame;
    }

    public static boolean isHomePageShowNewBook() {
        return homePageShowNewBook;
    }

    public static void setHomePageShowNewBook(boolean homePageShowNewBook) {
        SettingsEntity.homePageShowNewBook = homePageShowNewBook;
    }

    public static boolean isHomePageShowNewMusic() {
        return homePageShowNewMusic;
    }

    public static void setHomePageShowNewMusic(boolean homePageShowNewMusic) {
        SettingsEntity.homePageShowNewMusic = homePageShowNewMusic;
    }

    public static boolean isHomePageShowPopularMovie() {
        return homePageShowPopularMovie;
    }

    public static void setHomePageShowPopularMovie(boolean homePageShowPopularMovie) {
        SettingsEntity.homePageShowPopularMovie = homePageShowPopularMovie;
    }

    public static boolean isHomePageShowPopularTvShow() {
        return homePageShowPopularTvShow;
    }

    public static void setHomePageShowPopularTvShow(boolean homePageShowPopularTvShow) {
        SettingsEntity.homePageShowPopularTvShow = homePageShowPopularTvShow;
    }

    public static boolean isHomePageShowPopularGame() {
        return homePageShowPopularGame;
    }

    public static void setHomePageShowPopularGame(boolean homePageShowPopularGame) {
        SettingsEntity.homePageShowPopularGame = homePageShowPopularGame;
    }

    public static boolean isHomePageShowPopularBook() {
        return homePageShowPopularBook;
    }

    public static void setHomePageShowPopularBook(boolean homePageShowPopularBook) {
        SettingsEntity.homePageShowPopularBook = homePageShowPopularBook;
    }

    public static boolean isHomePageShowPopularMusic() {
        return homePageShowPopularMusic;
    }

    public static void setHomePageShowPopularMusic(boolean homePageShowPopularMusic) {
        SettingsEntity.homePageShowPopularMusic = homePageShowPopularMusic;
    }

    public static boolean isStickyTopMenu() {
        return stickyTopMenu;
    }

    public static void setStickyTopMenu(boolean stickyTopMenu) {
        SettingsEntity.stickyTopMenu = stickyTopMenu;
    }

    public static DatabaseTypeEnum getDatabaseType() {
        return databaseType;
    }

    public static void setDatabaseType(DatabaseTypeEnum databaseType) {
        SettingsEntity.databaseType = databaseType;
    }

    public static String getDatabaseName() {
        return databaseName;
    }

    public static void setDatabaseName(String databaseName) {
        SettingsEntity.databaseName = databaseName;
    }

    public static int getMinDatabaseConnections() {
        return minDatabaseConnections;
    }

    public static void setMinDatabaseConnections(int minDatabaseConnections) {
        SettingsEntity.minDatabaseConnections = minDatabaseConnections;
    }

    public static int getMaxDatabaseConnections() {
        return maxDatabaseConnections;
    }

    public static void setMaxDatabaseConnections(int maxDatabaseConnections) {
        SettingsEntity.maxDatabaseConnections = maxDatabaseConnections;
    }

    public static String[] getEntityPackages() {
        return entityPackages;
    }

    public static void setEntityPackages(String[] entityPackages) {
        SettingsEntity.entityPackages = entityPackages;
    }

    public static boolean isEnableHistory() {
        return enableHistory;
    }

    public static void setEnableHistory(boolean enableHistory) {
        SettingsEntity.enableHistory = enableHistory;
    }

    public static boolean isEnableUpload() {
        return enableUpload;
    }

    public static void setEnableUpload(boolean enableUpload) {
        SettingsEntity.enableUpload = enableUpload;
    }

    public static String getProfilePhotoFolder() {
        return profilePhotoFolder;
    }

    public static void setProfilePhotoFolder(String profilePhotoFolder) {
        SettingsEntity.profilePhotoFolder = profilePhotoFolder;
    }

    public static int getChunk() {
        return chunk;
    }

    public static void setChunk(int chunk) {
        SettingsEntity.chunk = chunk;
    }
}