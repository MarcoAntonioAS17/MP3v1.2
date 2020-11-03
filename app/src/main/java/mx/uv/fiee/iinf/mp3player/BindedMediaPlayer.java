package mx.uv.fiee.iinf.mp3player;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class BindedMediaPlayer extends Service {

    MediaPlayer player;
    boolean updateProgressBar;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    private void StartPlayer(){
        player = new MediaPlayer ();

        // establece el manejador del evento de reproducción finalizada
        player.setOnCompletionListener (mediaPlayer -> {
            // operaciones de limpieza cuando termina la reproducción
            updateProgressBar = false;
            //if (posThread != null) posThread.interrupt ();
            DetailsActivity.
        });
    }
}
