QT += quick androidextras

ANDROID_PACKAGE_SOURCE_DIR = $$PWD/android-sources

SOURCES += \
    main.cpp \
    notificationclient.cpp

OTHER_FILES += \
    qml/main.qml \
    android-sources/src/org/qtproject/example/notification/NotificationClient.java \
    android-sources/AndroidManifest.xml

RESOURCES += \
    main.qrc

HEADERS += \
    notificationclient.h

target.path = $$[QT_INSTALL_EXAMPLES]/androidextras/notification
INSTALLS += target

DISTFILES += \
    android-sources/build.gradle \
    android-sources/gradle/wrapper/gradle-wrapper.jar \
    android-sources/gradle/wrapper/gradle-wrapper.properties \
    android-sources/gradle.properties \
    android-sources/settings.gradle \
    android-sources/src/org/qtproject/example/notification/IntercomActivity.java \
    android-sources/src/org/qtproject/example/notification/SampleApplication.java \
    android-sources/res/values/strings.xml \
    android-sources/res/xml/shortcuts.xml \
    android-sources/src/org/qtproject/example/biometric/MainActivity.java \
    android-sources/res/drawable/ic_launcher_background.xml \
    android-sources/res/drawable-v24/ic_launcher_foreground.xml \
    android-sources/res/layout/activity_main.xml \
    android-sources/res/mipmap-anydpi-v26/ic_launcher.xml \
    android-sources/res/mipmap-anydpi-v26/ic_launcher_round.xml \
    android-sources/res/values/colors.xml \
    android-sources/res/values/styles.xml \
    android-sources/res/drawable/icon.png \
    android-sources/res/mipmap-hdpi/ic_launcher.png \
    android-sources/res/mipmap-hdpi/ic_launcher_round.png \
    android-sources/res/mipmap-mdpi/ic_launcher.png \
    android-sources/res/mipmap-mdpi/ic_launcher_round.png \
    android-sources/res/mipmap-xhdpi/ic_launcher.png \
    android-sources/res/mipmap-xhdpi/ic_launcher_round.png \
    android-sources/res/mipmap-xxhdpi/ic_launcher.png \
    android-sources/res/mipmap-xxhdpi/ic_launcher_round.png \
    android-sources/res/mipmap-xxxhdpi/ic_launcher.png \
    android-sources/res/mipmap-xxxhdpi/ic_launcher_round.png
