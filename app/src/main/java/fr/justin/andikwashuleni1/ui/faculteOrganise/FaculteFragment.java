package fr.justin.andikwashuleni1.ui.faculteOrganise;

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
import fr.justin.andikwashuleni1.ui.home.HomeViewModel;


public class FaculteFragment extends Fragment {

private FaculteViewModel faculteViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        faculteViewModel =
                new ViewModelProvider(this).get(FaculteViewModel.class);
        View root = inflater.inflate(R.layout.blaba, container, false);
        final TextView textView = root.findViewById(R.id.text_fac);
        faculteViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
