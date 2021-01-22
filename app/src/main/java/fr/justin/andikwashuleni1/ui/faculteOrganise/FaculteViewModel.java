package fr.justin.andikwashuleni1.ui.faculteOrganise;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FaculteViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public FaculteViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(".LISTE DES FACULTEES");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
