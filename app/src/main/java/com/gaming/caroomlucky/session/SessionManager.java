package com.gaming.caroomlucky.session;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

public class SessionManager {
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    public Context context;
    private static final String SESSION = "SESSION";
    private static final String isGoogle = "isGoogle";

    //google login
    private static final String isGoogleLogin = "isGoogleLogin";
    private static final String GoogleDisplayName = "google_display_name";
    private static final String GoogleEmail = "google_email";
    private static final String GoogleFamilyName = "google_family_name";
    private static final String GoogleGivenName = "google_given_name";
    private static final String GoogleId = "google_id";
    private static final String GoogleIdToken = "google_id_token";
    private static final String GoogleServerAuthenticationCode = "google_server_authentication_code";
    private static final String GoogleAccount = "google_account";
    private static final String GoogleGrantedScopes = "google_granted_scopes";
    private static final String GooglePhotoUrl = "google_photo_url";
    private static final String GoogleRequestedScopes = "google_requested_scopes";
    //facebookLogin
    private static final String isFacebookLogin = "isLogin";

    @SuppressLint("CommitPrefEdits")
    public SessionManager(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences("LOGIN", 0);
        editor = sharedPreferences.edit();
    }

    public SharedPreferences getSharedPreferences() {
        return sharedPreferences;
    }

    public void setSharedPreferences(SharedPreferences sharedPreferences) {
        this.sharedPreferences = sharedPreferences;
    }

    public SharedPreferences.Editor getEditor() {
        return editor;
    }

    public void setEditor(SharedPreferences.Editor editor) {
        this.editor = editor;
    }


    public Context getContext() {
        return context;
    }




    public void setContext(Context context) {
        this.context = context;
    }

    public static String getSESSION() {
        return SESSION;
    }

    public static String getIsGoogle() {
        return isGoogle;
    }

    public static String getIsGoogleLogin() {
        return isGoogleLogin;
    }

    public void setIsGoogleLogin(boolean googlesession){
        editor.putBoolean(isGoogleLogin,googlesession);
        editor.apply();
    }

    public void setIsFacebookLogin(boolean facebooksession){
        editor.putBoolean(isFacebookLogin,facebooksession);
        editor.apply();
    }

    public static String getGoogleDisplayName() {
        return GoogleDisplayName;
    }

    public static String getGoogleEmail() {
        return GoogleEmail;
    }

    public static String getGoogleFamilyName() {
        return GoogleFamilyName;
    }

    public static String getGoogleGivenName() {
        return GoogleGivenName;
    }

    public static String getGoogleId() {
        return GoogleId;
    }

    public static String getGoogleIdToken() {
        return GoogleIdToken;
    }

    public static String getGoogleServerAuthenticationCode() {
        return GoogleServerAuthenticationCode;
    }

    public static String getGoogleAccount() {
        return GoogleAccount;
    }

    public static String getGoogleGrantedScopes() {
        return GoogleGrantedScopes;
    }

    public static String getGooglePhotoUrl() {
        return GooglePhotoUrl;
    }

    public static String getGoogleRequestedScopes() {
        return GoogleRequestedScopes;
    }

    public static String getIsFacebookLogin() {
        return isFacebookLogin;
    }

    public boolean checkisGoogleSession(){
        return sharedPreferences.getBoolean(isGoogle,false);
    }
    public boolean checkisFacebookSession(){
        return sharedPreferences.getBoolean(isFacebookLogin,false);
    }


    public void createSession(String responseObject, boolean session) {
        editor.putString(GoogleDisplayName,responseObject);
        editor.putString(GoogleEmail,responseObject);
        editor.putString(GoogleFamilyName,responseObject);
        editor.putString(GoogleGivenName,responseObject);
        editor.putString(GoogleId,responseObject);
        editor.putString(GoogleIdToken,responseObject);
        editor.putString(GoogleServerAuthenticationCode,responseObject);
        editor.putString(GoogleAccount,responseObject);
        editor.putString(GoogleGrantedScopes,responseObject);
        editor.putString(GooglePhotoUrl,responseObject);
        editor.putString(GoogleRequestedScopes,responseObject);
        editor.putBoolean(SESSION,session);
        editor.commit();
    }





    public void logout() {
        editor.clear();
        editor.commit();
    }

}
