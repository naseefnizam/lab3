<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
package="com.example.lab3">

<application
android:allowBackup="true"
android:icon="@mipmap/ic_launcher"
android:label="lab3"
android:roundIcon="@mipmap/ic_launcher_round"
android:supportsRtl="true"
android:theme="@style/AppTheme">
<activity android:name=".DisplayMessageActivity" android:parentActivityName=".MainActivity">
<meta-data
android:name="android.support.PARENT_ACTIVITY"
android:value=".MainActivity" />
</activity>
<activity android:name=".MainActivity">
<intent-filter>
<action android:name="android.intent.action.MAIN" />

<category android:name="android.intent.category.LAUNCHER" />
</intent-filter>
</activity>
</application>

</manifest>