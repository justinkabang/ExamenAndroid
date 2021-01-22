package fr.justin.andikwashuleni1.ui.aide;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AideViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AideViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("ASP.NET est un framework permettant de générer " +
                "des pages web dynamiques. Une page ASP.NET est composée de" +
                " deux parties : d'un côté du code HTML, et de l'autre " +
                "des instructions de programme3 " +
                "" +
                "Le moteur d'ASP.NET est un filtre, branché sur le " +
                "serveur web IIS par son interface de programmation ISAPI3." +
                " Le moteur ASP.NET est distribué avec le framework .NET4. " +
                "Il peut être utilisé avec n'importe quel langage de" +
                " programmation pour la plateforme");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
