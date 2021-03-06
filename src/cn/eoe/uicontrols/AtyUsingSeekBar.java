package cn.eoe.uicontrols;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class AtyUsingSeekBar extends Activity {

	private SeekBar seekBar;
	private TextView tvOut;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aty_using_seekbar);
		
		tvOut = (TextView) findViewById(R.id.tvOut);
		
		seekBar = (SeekBar) findViewById(R.id.seekBar);
		seekBar.setMax(100);
		seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				
				tvOut.setText(String.format("当前进度为：%d", progress)+"%");
			}
		});
	}
}
