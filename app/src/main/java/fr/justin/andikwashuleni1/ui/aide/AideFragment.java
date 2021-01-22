package fr.justin.andikwashuleni1.ui.aide;

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


public class AideFragment extends Fragment {

    private AideViewModel aideViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        aideViewModel =
                new ViewModelProvider(this).get(AideViewModel.class);
        View root = inflater.inflate(R.layout.aide, container, false);
        final TextView textView = root.findViewById(R.id.text_aide);
        aideViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
