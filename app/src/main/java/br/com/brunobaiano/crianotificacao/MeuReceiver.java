package br.com.brunobaiano.crianotificacao;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MeuReceiver extends BroadcastReceiver {
    public MeuReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        NotificationManager nm = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        nm.cancel(R.string.app_name);

        Toast.makeText(context, "EXEMPLO DE BROADCAST!!!", Toast.LENGTH_SHORT).show();
    }
}
