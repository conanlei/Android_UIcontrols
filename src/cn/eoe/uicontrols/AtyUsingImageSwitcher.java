package cn.eoe.uicontrols;

import android.app.Activity;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class AtyUsingImageSwitcher extends Activity {

	private ImageSwitcher switcher;
	private boolean showImg1 = true;

	protected void onCreate(android.os.Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aty_using_imageswitcher);

		switcher = (ImageSwitcher) findViewById(R.id.imageSwitcher);
		switcher.setFactory(new ViewSwitcher.ViewFactory() {
			
			@Override
			public View makeView() {
				return new ImageView(AtyUsingImageSwitcher.this);
			}
		});
		switcher.setInAnimation(AnimationUtils.loadAnimation(AtyUsingImageSwitcher.this, android.R.anim.fade_in));
		switcher.setOutAnimation(AnimationUtils.loadAnimation(AtyUsingImageSwitcher.this, android.R.anim.fade_out));
		
		switcher.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				showImg1=!showImg1;
				
				showCurrentImage();
			}
		});
		
		showCurrentImage();
		
	};


	private void showCurrentImage(){
		if (showImg1) {
			switcher.setImageResource(R.drawable.img1);
		}else{
			switcher.setImageResource(R.drawable.img2);
		}
	}
}
