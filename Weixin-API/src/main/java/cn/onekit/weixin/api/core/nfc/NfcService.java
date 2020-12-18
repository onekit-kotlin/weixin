package cn.onekit.weixin.api.core.nfc;

import android.nfc.cardemulation.HostApduService;
import android.os.Bundle;

public class NfcService extends HostApduService {
    public static fun callback;
    public static byte[] data;
    @Override
    public byte[] processCommandApdu(byte[] commandApdu, Bundle extras) {
        if(callback==null){
            return null;
        }
        callback.invoke(new JsObject());//1,new ArrayBuffer(commandApdu),1));
        return data;
    }

    @Override
    public void onDeactivated(int reason) {

    }
}
