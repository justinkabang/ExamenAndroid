package fr.justin.andikwashuleni1.ui.inscription;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InscriptionViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public InscriptionViewModel() {

        mText = new MutableLiveData<>();

        mText.setValue("I. FICHE INDIVIDUELLE");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
