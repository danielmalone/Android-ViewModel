package com.finepointmobile.viewmodel1;

import android.arch.lifecycle.LifecycleActivity;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends LifecycleActivity {

    EditText asdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        asdf = (EditText) findViewById(R.id.asdf);

        ContentViewHolder contentViewHolder = ViewModelProviders.of(this).get(ContentViewHolder.class);

        if (contentViewHolder.getAsdf() == null) {
            contentViewHolder.setAsdf(asdf.getText().toString());
        } else {
            String content = contentViewHolder.getAsdf();
            asdf.setText(content);
        }
    }
}
