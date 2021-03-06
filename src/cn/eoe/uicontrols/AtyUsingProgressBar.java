package cn.eoe.uicontrols;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class AtyUsingProgressBar extends Activity {

	private ProgressBar pb;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aty_using_progressbar);
		
		pb = (ProgressBar) findViewById(R.id.progressBar);
		pb.setMax(100);
		
		pb.setProgress(50);
	}
	
	
	@Override
	protected void onResume() {
		super.onResume();
		
		startTimer();
	}
	
	
	@Override
	protected void onPause() {
		super.onPause();
		stopTimer();
	}
	
	
	private int progress = 0;
	
	public void startTimer(){
		if (timer==null) {
			timer = new Timer();
			task = new TimerTask() {
				
				@Override
				public void run() {
					progress++;
					
					pb.setProgress(progress);
				}
			};
			timer.schedule(task, 1000, 1000);
		}
	}
	
	
	public void stopTimer(){
		if (timer!=null) {
			task.cancel();
			timer.cancel();
			
			task = null;
			timer = null;
		}
	}
	
	private Timer timer=null;
	private TimerTask task = null;
}
