package alexclin.qfix.qfixgradle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import alexclin.qfix.qfixgradle.bug.TestActivity;

public class ActMainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);
        TextView tv = (TextView) findViewById(R.id.tv_test);
        tv.setText("Origin Version");
        View view = findViewById(R.id.testBtn);
        view.setVisibility(View.VISIBLE);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), TestActivity.class));
            }
        });
    }
}
