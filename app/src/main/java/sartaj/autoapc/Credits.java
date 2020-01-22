package sartaj.autoapc;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class Credits extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
        TextView txtid = (TextView) findViewById(R.id.txtidea);
        TextView txtdev = (TextView) findViewById(R.id.txtdev);

        txtid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://fb.me/omarmuqthar.karuvadan"));
                startActivity(browser);
            }
        });

txtdev.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent browser1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://fb.me/sartajroshan"));
        startActivity(browser1);
    }
});
    }
}
