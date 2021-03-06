package org.jdownloader.gui;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

import org.appwork.utils.Files;
import org.appwork.utils.Files.Handler;

public class IconKey {

    public static void main(String[] args) throws URISyntaxException {
        URL url = IconKey.class.getResource(IconKey.class.getSimpleName() + ".class");
        File file = new File(url.toURI());
        while (!file.getName().equals("bin")) {
            file = file.getParentFile();
        }
        File images = new File(file.getParentFile(), "themes\\themes\\standard\\org\\jdownloader\\images");
        Files.walkThroughStructure(new Handler<RuntimeException>() {
            protected File root = null;

            @Override
            public void intro(File f) throws RuntimeException {
                root = f;
            }

            @Override
            public void onFile(File f) throws RuntimeException {
                if (f.getName().endsWith(".png")) {
                    String rel = Files.getRelativePath(root, f);
                    rel = rel.substring(0, rel.length() - 4);

                    String name = rel.toUpperCase().replaceAll("\\W", "_");
                    System.out.println("public static final String ICON_" + name + " = \"" + rel + "\";");

                }
            }

            @Override
            public void outro(File f) throws RuntimeException {
            }

        }, images);
        System.out.println(url);
    }

    public static final String ICON_16_FILTER                    = "16/filter";
    public static final String ICON_16_MIMIGLYPHS_CLOSE          = "16/mimiglyphs/close";
    public static final String ICON_16_TRASH                     = "16/trash";
    public static final String ICON_9KW                          = "9kw";
    public static final String ICON_ABOUT                        = "about";
    public static final String ICON_ADD                          = "add";
    public static final String ICON_ADDCONTAINER                 = "addContainer";
    public static final String ICON_ADD_SPECIAL                  = "add_special";
    public static final String ICON_ADVANCEDCONFIG               = "advancedConfig";
    public static final String ICON_ARCHIVEPASSWORD              = "archivepassword";
    public static final String ICON_AUDIO                        = "audio";
    public static final String ICON_AUTO_RECONNECT               = "auto-reconnect";
    public static final String ICON_BAD                          = "bad";
    public static final String ICON_BANDWIDTH                    = "bandwidth";
    public static final String ICON_BARRIERFREESETTINGS          = "barrierfreesettings";
    public static final String ICON_BASICAUTH                    = "basicauth";
    public static final String ICON_BATCH                        = "batch";
    public static final String ICON_BOARD                        = "board";
    public static final String ICON_BOTTOMBAR                    = "bottombar";
    public static final String ICON_BOTTY_STOP                   = "botty_stop";
    public static final String ICON_BOX                          = "box";
    public static final String ICON_BRIGHTMIX_WRENCH             = "brightmix/wrench";
    public static final String ICON_BRIGHTMIX_WRENCH_8           = "brightmix/wrench_8";
    public static final String ICON_BROWSE                       = "browse";
    public static final String ICON_BUBBLE                       = "bubble";
    public static final String ICON_BUG                          = "bug";
    public static final String ICON_BUY                          = "buy";
    public static final String ICON_CANCEL                       = "cancel";
    public static final String ICON_CASE                         = "case";
    public static final String ICON_CBH                          = "cbh";
    public static final String ICON_CES                          = "ces";
    public static final String ICON_CHAT                         = "chat";
    public static final String ICON_CHECKBOX_FALSE               = "checkbox_false";
    public static final String ICON_CHECKBOX_TRUE                = "checkbox_true";
    public static final String ICON_CHECKBOX_UNDEFINED           = "checkbox_undefined";
    public static final String ICON_CHUNKS                       = "chunks";
    public static final String ICON_CLEAR                        = "clear";
    public static final String ICON_CLIPBOARD                    = "clipboard";
    public static final String ICON_CLOSE_ON                     = "close.on";
    public static final String ICON_CLOSE                        = "close";
    public static final String ICON_COLUMNBUTTON                 = "columnButton";
    public static final String ICON_COMPRESS                     = "compress";
    public static final String ICON_CONFIRMALL                   = "confirmAll";
    public static final String ICON_CONFIRMSELECTEDLINKS         = "confirmSelectedLinks";
    public static final String ICON_CONSOLE                      = "console";
    public static final String ICON_CONSOLE_BATCH                = "console_batch";
    public static final String ICON_CONTRIBUTER                  = "contributer";
    public static final String ICON_COPY                         = "copy";
    public static final String ICON_COVER                        = "cover";
    public static final String ICON_CUT                          = "cut";
    public static final String ICON_DBC                          = "dbc";
    public static final String ICON_DEFAULTPROXY                 = "defaultProxy";
    public static final String ICON_DELETE                       = "delete";
    public static final String ICON_DESKTOP                      = "desktop";
    public static final String ICON_DIALOG_CANCEL                = "dialog/cancel";
    public static final String ICON_DIALOG_ERROR                 = "dialog/error";
    public static final String ICON_DIALOG_FIND                  = "dialog/find";
    public static final String ICON_DIALOG_HELP                  = "dialog/help";
    public static final String ICON_DIALOG_INFO                  = "dialog/info";
    public static final String ICON_DIALOG_LOGIN                 = "dialog/login";
    public static final String ICON_DIALOG_WARNING               = "dialog/warning";
    public static final String ICON_DIALOGOCR                    = "dialogOCR";
    public static final String ICON_DISABLE                      = "disable";
    public static final String ICON_DISABLED                     = "disabled";
    public static final String ICON_DLC                          = "dlc";
    public static final String ICON_DOCUMENT                     = "document";
    public static final String ICON_DOWNLOAD                     = "download";
    public static final String ICON_DOWNLOADMANAGMENT            = "downloadmanagment";
    public static final String ICON_DOWNLOADPASSWORD             = "downloadpassword";
    public static final String ICON_DOWNLOADPATH                 = "downloadpath";
    public static final String ICON_EDIT                         = "edit";
    public static final String ICON_ENABLE                       = "enable";
    public static final String ICON_ENABLED                      = "enabled";
    public static final String ICON_ERROR                        = "error";
    public static final String ICON_EVENT                        = "event";
    public static final String ICON_EXIT                         = "exit";
    public static final String ICON_EXPORT                       = "export";
    public static final String ICON_EXTENSION                    = "extension";
    public static final String ICON_EXTENSIONMANAGER             = "extensionmanager";
    public static final String ICON_EXTRACT                      = "extract";
    public static final String ICON_EXTTABLE_COLUMNBUTTON        = "exttable/columnButton";
    public static final String ICON_EXTTABLE_FIND                = "exttable/find";
    public static final String ICON_EXTTABLE_FINDMENU            = "exttable/findmenu";
    public static final String ICON_EXTTABLE_LOCKCOLUMN          = "exttable/lockColumn";
    public static final String ICON_EXTTABLE_RESETCOLUMNS        = "exttable/resetColumns";
    public static final String ICON_EXTTABLE_SORT                = "exttable/sort";
    public static final String ICON_EXTTABLE_SORTASC             = "exttable/sortAsc";
    public static final String ICON_EXTTABLE_SORTDESC            = "exttable/sortDesc";
    public static final String ICON_EXTTABLE_WIDTHLOCKED         = "exttable/widthLocked";
    public static final String ICON_FALSE_ORANGE                 = "false-orange";
    public static final String ICON_FALSE                        = "false";
    public static final String ICON_FAU_OSR_HEADER               = "fau_osr_header";
    public static final String ICON_FAV_BIG_NETLOAD_IN           = "fav/big.netload.in";
    public static final String ICON_FAV_BIG_SHARE_ONLINE_BIZ     = "fav/big.share-online.biz";
    public static final String ICON_FAV_BIG_UPLOADED_TO          = "fav/big.uploaded.to";
    public static final String ICON_FAV_FOOTER_UPLOADED_TO       = "fav/footer.uploaded.to";
    public static final String ICON_FAV_LARGE_NETLOAD_IN         = "fav/large.netload.in";
    public static final String ICON_FAV_LARGE_SHARE_ONLINE_BIZ   = "fav/large.share-online.biz";
    public static final String ICON_FAV_LARGE_UPLOADED_TO        = "fav/large.uploaded.to";
    public static final String ICON_FFMPEG                       = "ffmpeg";
    public static final String ICON_FILE                         = "file";
    public static final String ICON_FILEICON                     = "fileIcon";
    public static final String ICON_FILE_ERROR                   = "file_error";
    public static final String ICON_FILTER                       = "filter";
    public static final String ICON_FILTER_EXCEPTIONS            = "filter_exceptions";
    public static final String ICON_FIND                         = "find";
    public static final String ICON_FLAGS_DE                     = "flags/de";
    public static final String ICON_FLAGS_EN                     = "flags/en";
    public static final String ICON_FOLDER                       = "folder";
    public static final String ICON_FOLDER_ADD                   = "folder_add";
    public static final String ICON_FOLDER_OPEN                  = "folder_open";
    public static final String ICON_GO_BOTTOM                    = "go-bottom";
    public static final String ICON_GO_DOWN                      = "go-down";
    public static final String ICON_GO_FIRST                     = "go-first";
    public static final String ICON_GO_JUMP                      = "go-jump";
    public static final String ICON_GO_LAST                      = "go-last";
    public static final String ICON_GO_NEXT                      = "go-next";
    public static final String ICON_GO_PREVIOUS                  = "go-previous";
    public static final String ICON_GO_TOP                       = "go-top";
    public static final String ICON_GO_UP                        = "go-up";
    public static final String ICON_GOOD                         = "good";
    public static final String ICON_GUI                          = "gui";
    public static final String ICON_GUIPERFORMANCE               = "guiperformance";
    public static final String ICON_HARDDISK                     = "harddisk";
    public static final String ICON_HASHSUM                      = "hashsum";
    public static final String ICON_HELP                         = "help";
    public static final String ICON_HOME                         = "home";
    public static final String ICON_IMAGE                        = "image";
    public static final String ICON_IMAGELOADER                  = "imageLoader";
    public static final String ICON_IMPORT                       = "import";
    public static final String ICON_INFO                         = "info";
    public static final String ICON_INTERFACE                    = "interface";
    public static final String ICON_LANGUAGE                     = "language";
    public static final String ICON_LINK                         = "link";
    public static final String ICON_LINKGRABBER                  = "linkgrabber";
    public static final String ICON_LIST                         = "list";
    public static final String ICON_LOAD                         = "load";
    public static final String ICON_LOCK                         = "lock";
    public static final String ICON_LOG                          = "log";
    public static final String ICON_LOGIN                        = "login";
    public static final String ICON_LOGINS                       = "logins";
    public static final String ICON_LOGO_CNL                     = "logo/cnl";
    public static final String ICON_LOGO_JD_LOGO_128_128         = "logo/jd_logo_128_128";
    public static final String ICON_LOGO_JD_LOGO_256_256         = "logo/jd_logo_256_256";
    public static final String ICON_LOGO_JD_LOGO_54_54           = "logo/jd_logo_54_54";
    public static final String ICON_LOGO_JD_LOGO_54_54_TRANS     = "logo/jd_logo_54_54_trans";
    public static final String ICON_LOGO_JD_LOGO_64_64           = "logo/jd_logo_64_64";
    public static final String ICON_LOGO_LOGO_128X128            = "logo/logo-128x128";
    public static final String ICON_LOGO_LOGO_48X48              = "logo/logo-48x48";
    public static final String ICON_LOGO_LOGO_14_14              = "logo/logo_14_14";
    public static final String ICON_LOGO_LOGO_15_15              = "logo/logo_15_15";
    public static final String ICON_LOGO_LOGO_16_16              = "logo/logo_16_16";
    public static final String ICON_LOGO_LOGO_17_17              = "logo/logo_17_17";
    public static final String ICON_LOGO_LOGO_18_18              = "logo/logo_18_18";
    public static final String ICON_LOGO_LOGO_19_19              = "logo/logo_19_19";
    public static final String ICON_LOGO_LOGO_20_20              = "logo/logo_20_20";
    public static final String ICON_LOGOUT                       = "logout";
    public static final String ICON_MEDIA_PLAYBACK_PAUSE         = "media-playback-pause";
    public static final String ICON_MEDIA_PLAYBACK_START         = "media-playback-start";
    public static final String ICON_MEDIA_PLAYBACK_START_FORCED  = "media-playback-start_forced";
    public static final String ICON_MEDIA_PLAYBACK_STOP          = "media-playback-stop";
    public static final String ICON_MEDIAPLAYER                  = "mediaplayer";
    public static final String ICON_MENU                         = "menu";
    public static final String ICON_MINIMIZE                     = "minimize";
    public static final String ICON_MINIMIZE_LEFT                = "minimize_left";
    public static final String ICON_MINIMIZE_RIGHT               = "minimize_right";
    public static final String ICON_MODEM                        = "modem";
    public static final String ICON_MONEY                        = "money";
    public static final String ICON_MORE                         = "more";
    public static final String ICON_MYJDOWNLOADER                = "myjdownloader";
    public static final String ICON_NETWORK_ERROR                = "network-error";
    public static final String ICON_NETWORK_IDLE                 = "network-idle";
    public static final String ICON_NEW                          = "new";
    public static final String ICON_OCR                          = "ocr";
    public static final String ICON_OK                           = "ok";
    public static final String ICON_OPEN                         = "open";
    public static final String ICON_OPTIONS                      = "options";
    public static final String ICON_ORDER                        = "order";
    public static final String ICON_OSRLOGO                      = "osrlogo";
    public static final String ICON_OSRLOGO2                     = "osrlogo2";
    public static final String ICON_PACKAGE_CLOSED               = "package_closed";
    public static final String ICON_PACKAGE_CLOSED_ERROR         = "package_closed_error";
    public static final String ICON_PACKAGE_NEW                  = "package_new";
    public static final String ICON_PACKAGE_OPEN                 = "package_open";
    public static final String ICON_PACKAGE_OPEN_ERROR           = "package_open_error";
    public static final String ICON_PACKAGIZER                   = "packagizer";
    public static final String ICON_PARALELL                     = "paralell";
    public static final String ICON_PASSWORD                     = "password";
    public static final String ICON_PASTE                        = "paste";
    public static final String ICON_PLAY                         = "play";
    public static final String ICON_PLUGIN                       = "plugin";
    public static final String ICON_POPDOWNLARGE                 = "popDownLarge";
    public static final String ICON_POPDOWNSMALL                 = "popDownSmall";
    public static final String ICON_POPUPLARGE                   = "popUpLarge";
    public static final String ICON_POPUPSMALL                   = "popUpSmall";
    public static final String ICON_PREMIUM                      = "premium";
    public static final String ICON_PREMIUMZONE                  = "premiumzone";
    public static final String ICON_PRIO__1                      = "prio_-1";
    public static final String ICON_PRIO_0                       = "prio_0";
    public static final String ICON_PRIO_1                       = "prio_1";
    public static final String ICON_PRIO_2                       = "prio_2";
    public static final String ICON_PRIO_3                       = "prio_3";
    public static final String ICON_PROXY                        = "proxy";
    public static final String ICON_PROXY_ROTATE                 = "proxy_rotate";
    public static final String ICON_PUZZLE                       = "puzzle";
    public static final String ICON_QUESTION                     = "question";
    public static final String ICON_RAR                          = "rar";
    public static final String ICON_RECONNECT                    = "reconnect";
    public static final String ICON_RECORD                       = "record";
    public static final String ICON_REDO                         = "redo";
    public static final String ICON_REFRESH                      = "refresh";
    public static final String ICON_REGEX                        = "regex";
    public static final String ICON_REGEXSTAR                    = "regexStar";
    public static final String ICON_REMOTEOCR                    = "remoteOCR";
    public static final String ICON_REMOVE                       = "remove";
    public static final String ICON_REMOVE_DISABLED              = "remove_disabled";
    public static final String ICON_REMOVE_DUPES                 = "remove_dupes";
    public static final String ICON_REMOVE_EXTRACTED             = "remove_extracted";
    public static final String ICON_REMOVE_FAILED                = "remove_failed";
    public static final String ICON_REMOVE_OFFLINE               = "remove_offline";
    public static final String ICON_REMOVE_OK                    = "remove_ok";
    public static final String ICON_RENEW                        = "renew";
    public static final String ICON_REPLACE                      = "replace";
    public static final String ICON_RESET                        = "reset";
    public static final String ICON_RESTART                      = "restart";
    public static final String ICON_RESUME                       = "resume";
    public static final String ICON_RIGHT                        = "right";
    public static final String ICON_ROBOT                        = "robot";
    public static final String ICON_ROBOT_DEL                    = "robot_del";
    public static final String ICON_ROBOT_INFO                   = "robot_info";
    public static final String ICON_ROBOT_SOS                    = "robot_sos";
    public static final String ICON_RSS                          = "rss";
    public static final String ICON_RUN                          = "run";
    public static final String ICON_SAVE                         = "save";
    public static final String ICON_SAVETO                       = "saveto";
    public static final String ICON_SEARCH                       = "search";
    public static final String ICON_SELECT                       = "select";
    public static final String ICON_SERVER                       = "server";
    public static final String ICON_SETTINGS                     = "settings";
    public static final String ICON_SHARE                        = "share";
    public static final String ICON_SIDEBAR                      = "sidebar";
    public static final String ICON_SILENTMODE                   = "silentmode";
    public static final String ICON_SKIPPED                      = "skipped";
    public static final String ICON_SMART                        = "smart";
    public static final String ICON_SORT                         = "sort";
    public static final String ICON_SORTDESC                     = "sortDesc";
    public static final String ICON_SPEED                        = "speed";
    public static final String ICON_SPIDER                       = "spider";
    public static final String ICON_SPLIT_PACKAGES               = "split_packages";
    public static final String ICON_START                        = "start";
    public static final String ICON_STOP                         = "stop";
    public static final String ICON_STOPPING                     = "stopping";
    public static final String ICON_STOPSIGN                     = "stopsign";
    public static final String ICON_STOP_CONDITIONAL             = "stop_conditional";
    public static final String ICON_SYSTEM_FILE_MANAGER          = "system-file-manager";
    public static final String ICON_TAB                          = "tab";
    public static final String ICON_TERMS                        = "terms";
    public static final String ICON_TEST                         = "test";
    public static final String ICON_TEXT                         = "text";
    public static final String ICON_THUMBS_DOWN                  = "thumbs-down";
    public static final String ICON_THUMBS_UP                    = "thumbs-up";
    public static final String ICON_TOGGLE                       = "toggle";
    public static final String ICON_TOOLBAR                      = "toolbar";
    public static final String ICON_TOOLBARSS                    = "toolbarss";
    public static final String ICON_TOPBAR                       = "topbar";
    public static final String ICON_TRASH                        = "trash";
    public static final String ICON_TREE_ARCHIVE                 = "tree_archive";
    public static final String ICON_TREE_ARCHIVE_ERROR           = "tree_archive_error";
    public static final String ICON_TREE_ARCHIVE_ERROR_OPEN      = "tree_archive_error_open";
    public static final String ICON_TREE_ARCHIVE_OPEN            = "tree_archive_open";
    public static final String ICON_TREE_PACKAGE_CLOSED          = "tree_package_closed";
    public static final String ICON_TREE_PACKAGE_CLOSED_ERROR    = "tree_package_closed_error";
    public static final String ICON_TREE_PACKAGE_OPEN            = "tree_package_open";
    public static final String ICON_TREE_PACKAGE_OPEN_ERROR      = "tree_package_open_error";
    public static final String ICON_TRUE_ORANGE                  = "true-orange";
    public static final String ICON_TRUE                         = "true";
    public static final String ICON_UNDO                         = "undo";
    public static final String ICON_UNPACK                       = "unpack";
    public static final String ICON_UPDATE                       = "update";
    public static final String ICON_UPDATERICON                  = "updatericon";
    public static final String ICON_UPDATERICON0                 = "updaterIcon0";
    public static final String ICON_UPDATERICON100               = "updaterIcon100";
    public static final String ICON_UPDATE_B                     = "update_b";
    public static final String ICON_UPLOAD                       = "upload";
    public static final String ICON_UPNP                         = "upnp";
    public static final String ICON_URL                          = "url";
    public static final String ICON_USERS                        = "users";
    public static final String ICON_USERS_FTP                    = "users_ftp";
    public static final String ICON_VALIDATE_ARCHIVE             = "validate_archive";
    public static final String ICON_VARIOUS                      = "various";
    public static final String ICON_VIDEO                        = "video";
    public static final String ICON_WAIT                         = "wait";
    public static final String ICON_WARNING                      = "warning";
    public static final String ICON_WARNING_BLUE                 = "warning_blue";
    public static final String ICON_WARNING_GREEN                = "warning_green";
    public static final String ICON_WARNING_RED                  = "warning_red";
    public static final String ICON_WIDE_AREA_NETWORK_CONNECTION = "wide-area-network-connection";
    public static final String ICON_WIZARD                       = "wizard";
}
