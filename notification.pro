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
    android-sources/src/org/qtproject/example/notification/Shortcuts.java \
    android-sources/res/values/strings.xml \
    android-sources/res/xml/shortcuts.xml
