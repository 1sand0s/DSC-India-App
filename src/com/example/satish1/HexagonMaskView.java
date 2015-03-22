package com.example.satish1;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class HexagonMaskView extends ImageView {

       public HexagonMaskView(Context ctx, AttributeSet attrs) {
              super(ctx, attrs);
       }

       @Override
       protected void onDraw(Canvas canvas) {

              Drawable drawable = getDrawable();

              if (drawable == null) {
                     return;
              }

              if (getWidth() == 0 || getHeight() == 0) {
                     return;
              }
              Bitmap b = ((BitmapDrawable) drawable).getBitmap();
              Bitmap bitmap = b.copy(Bitmap.Config.ARGB_8888, true);

              int w = getWidth(), h = getHeight();

              Bitmap roundBitmap = getRoundedCroppedBitmap(bitmap, w);
              canvas.drawBitmap(roundBitmap, 0, 0, null);

       }

       public static Bitmap getRoundedCroppedBitmap(Bitmap bitmap, int radius) {
              Bitmap finalBitmap;
              if (bitmap.getWidth() != radius || bitmap.getHeight() != radius)
                     finalBitmap = Bitmap.createScaledBitmap(bitmap, radius, radius,
                                  false);
              else
                     finalBitmap = bitmap;
              Bitmap output = Bitmap.createBitmap(finalBitmap.getWidth(),
                           finalBitmap.getHeight(), Config.ARGB_8888);
              Canvas canvas = new Canvas(output);

              Paint paint = new Paint();
              final Rect rect = new Rect(0, 0, finalBitmap.getWidth(),
                           finalBitmap.getHeight());

              Point point1_draw = new Point(75, 0);
              Point point2_draw = new Point(0, 50);
              Point point3_draw = new Point(0, 100);
              Point point4_draw = new Point(75, 150);
              Point point5_draw = new Point(150, 100);
              Point point6_draw = new Point(150, 50);

              Path path = new Path();
              path.moveTo(point1_draw.x, point1_draw.y);
              path.lineTo(point2_draw.x, point2_draw.y);
              path.lineTo(point3_draw.x, point3_draw.y);
              path.lineTo(point4_draw.x, point4_draw.y);
              path.lineTo(point5_draw.x, point5_draw.y);
              path.lineTo(point6_draw.x, point6_draw.y);

              path.close();
              canvas.drawARGB(0, 0, 0, 0);
              paint.setColor(Color.parseColor("#BAB399"));
              canvas.drawPath(path, paint);
              paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
              canvas.drawBitmap(finalBitmap, rect, rect, paint);

              return output;
       }

}

