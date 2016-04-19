package com.coderqi.publicutil.voice;


import java.util.ArrayList;

import android.content.Context;
import android.widget.Toast;

import com.example.naocontroller.Client;
import com.example.naocontroller.ControllerTalk;
import com.iflytek.cloud.speech.RecognizerResult;
import com.iflytek.cloud.speech.SpeechError;
import com.iflytek.cloud.ui.RecognizerDialogListener;

/**
 * ʶ��ص�������
 * voice controller
 */
public class MyRecognizerDialogLister implements RecognizerDialogListener{
	private ControllerTalk talker  = new ControllerTalk();
	private ArrayList<Client> clientList;
	private Context context;
	public MyRecognizerDialogLister(Context context,ArrayList<Client> clientList)
	{
		this.context = context;
		this.clientList = clientList;
	}
	public void setClientList(ArrayList<Client> list){
		this.clientList = list;
	}
	//�Զ���Ľ���ص��������ɹ�ִ�е�һ��������ʧ��ִ�еڶ�������
	@Override
	public void onResult(RecognizerResult results, boolean isLast) {
		// TODO Auto-generated method stub
		String text = JsonParser.parseIatResult(results.getResultString());
		talker.speak(text, clientList);
		System.out.println(text);
		Toast.makeText(context, text, Toast.LENGTH_LONG).show();
	}
	/**
	 * ʶ��ص�����.
	 */
	@Override
	public void onError(SpeechError error) {
		// TODO Auto-generated method stub
		int errorCoder = error.getErrorCode();
		switch (errorCoder) {
		case 10118:
			System.out.println("user don't speak anything");
			break;
		case 10204:
			System.out.println("can't connect to internet");
			break;
		default:
			break;
		}
	}

	

}
