import android.view.SurfaceView;

import com.google.android.gms.vision.CameraSource;
import com.google.android.gms.vision.text.TextRecognizer;

public class CameraActivity extends AppCompatActivity {
    private SurfaceView cameraView;
    private CameraSource cameraSource;
    final int RequestCameraPermission = 1001

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        cameraView = (SurfaceView)findViewById(R.id.surface_view);
        TextRecognizer textRecognizer = new TextRecognizer().Builder(getApplicationContext());
        if(!textRecognizer.isOperational())
        {
            Log.w("MainActivity", "Detector dependencies are not yet available");
        }
        else
    }
}
