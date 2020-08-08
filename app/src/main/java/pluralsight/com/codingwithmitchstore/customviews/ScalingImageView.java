package pluralsight.com.codingwithmitchstore.customviews;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

import androidx.annotation.Nullable;

public class ScalingImageView extends androidx.appcompat.widget.AppCompatImageView {
    public ScalingImageView(Context context) {
        super(context);
    }

    public ScalingImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
}
