package fr.justin.andikwashuleni1.ui.pain;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PainViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public PainViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Besoin de dessiner Cliquer sur le ");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
