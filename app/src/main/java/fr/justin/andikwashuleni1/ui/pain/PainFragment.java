package fr.justin.andikwashuleni1.ui.pain;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import fr.justin.andikwashuleni1.R;

public class PainFragment extends Fragment {
    fr.justin.andikwashuleni1.canevas canevas;

    private PainViewModel painViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        painViewModel =
                new ViewModelProvider(this).get(PainViewModel.class);
        View root = inflater.inflate(R.layout.pain, container, false);
        final TextView textView = root.findViewById(R.id.text_pain);
        painViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

}
