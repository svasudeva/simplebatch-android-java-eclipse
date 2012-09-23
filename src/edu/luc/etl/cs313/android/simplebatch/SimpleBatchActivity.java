package edu.luc.etl.cs313.android.simplebatch;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.widget.TextView;

public class SimpleBatchActivity extends Activity {

  private static String TAG = "simplebatch-android";

  @Override
  public void onCreate(final Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Log.i(TAG, "onCreate");
    setContentView(R.layout.activity_main);
    ((TextView) findViewById(R.id.textview)).setMovementMethod(new ScrollingMovementMethod());
  }

  @Override
  public void onStart() {
    super.onStart();
    new ConcreteBatchTask(new TextViewOutputStrategy((TextView) findViewById(R.id.textview))).run();
  }
}
