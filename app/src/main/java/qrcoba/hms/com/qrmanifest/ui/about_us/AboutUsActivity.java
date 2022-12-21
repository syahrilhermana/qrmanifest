package qrcoba.hms.com.qrmanifest.ui.about_us;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import qrcoba.hms.com.qrmanifest.R;
import qrcoba.hms.com.qrmanifest.databinding.ActivityAboutUsBinding;

import android.os.Bundle;
import android.view.MenuItem;

public class AboutUsActivity extends AppCompatActivity {

    ActivityAboutUsBinding mActivityAboutUsBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivityAboutUsBinding = DataBindingUtil.setContentView(this, R.layout.activity_about_us);
        initializeToolbar();

    }

    private void initializeToolbar() {
        setSupportActionBar(mActivityAboutUsBinding.toolbar);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowHomeEnabled(true);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                break;

            default:
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
