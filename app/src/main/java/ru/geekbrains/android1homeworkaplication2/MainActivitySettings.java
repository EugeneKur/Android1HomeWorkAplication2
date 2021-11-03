package ru.geekbrains.android1homeworkaplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivitySettings extends AppCompatActivity {

    public static final String PREFERENCES_NAME = "main";
    public static final String THEME_NAME = "theme";

    public static final int AppThemeLightStyle = 0;
    public static final int AppThemeDarkStyle = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(loadAppTheme());
        setContentView(R.layout.activity_main_settings);

        findViewById(R.id.radioButtonMaterialLight).setOnClickListener(v -> {
            saveAppTheme(AppThemeLightStyle);
            recreate();
        });
        findViewById(R.id.radioButtonMaterialDark).setOnClickListener(v -> {
            saveAppTheme(AppThemeDarkStyle);
            recreate();
        });
    }

    private int codeStyleToStyled(int codeStyle){
        switch (codeStyle){
            case AppThemeLightStyle:
                return R.style.AppThemeLight;
            case AppThemeDarkStyle:
            default:
                return R.style.AppThemeDark;
        }
    }

    private int loadAppTheme() {
        int codeTheme = getSharedPreferences(PREFERENCES_NAME, MODE_PRIVATE)
                .getInt(THEME_NAME, AppThemeDarkStyle);
        return codeStyleToStyled(codeTheme);
    }

    private void saveAppTheme(int code) {
        getSharedPreferences(PREFERENCES_NAME, MODE_PRIVATE).edit()
                .putInt(THEME_NAME, code)
                .apply();
    }
}