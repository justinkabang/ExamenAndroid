package fr.justin.andikwashuleni1.ui.camera;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CameraViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    public CameraViewModel() {

        mText = new MutableLiveData<>();
        mText.setValue("Nous voullons verifier si vous etes" +
                       " une personne physique" +
                       " vous allez prendre une photo de" +
                       " votre visage juste merci");
    }

    public LiveData<String> getText() {
        return mText;
    }

}
