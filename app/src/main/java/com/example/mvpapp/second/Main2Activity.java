package com.example.mvpapp.second;

import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mvpapp.R;
import com.example.mvpapp.RecyclerAdapter;
import com.example.mvpapp.data.model.Names;
import com.example.mvpapp.main.MainPresenter;

import java.util.List;

public class Main2Activity extends AppCompatActivity implements Main2MvpView {
    RecyclerView recyclerView;
    EditText editText;
    private ProgressBar progressBar;
    private Main2Presenter mainPresenter;

    List<Names> namesList;
    int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        editText = (EditText) findViewById(R.id.editText);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        mainPresenter = new Main2Presenter(this);
       // LoadData();
    }

    @Override
    public void LoadData() {
      //  namesList = mainPresenter.lst;
       // Toast.makeText(this, "" + mainPresenter.lst.size(), Toast.LENGTH_SHORT).show();
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(mainPresenter.lst);
        RecyclerView.LayoutManager recyce = new LinearLayoutManager(Main2Activity.this);
       // recyclerView.addItemDecoration(new GridSpacingdecoration(2, dpToPx(5), true));
        recyclerView.setLayoutManager(recyce);
      //  recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(recyclerAdapter);
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
        Toast.makeText(this, "Please Wait...", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
        Toast.makeText(this, "Done", Toast.LENGTH_SHORT).show();
    }

    public class GridSpacingdecoration extends RecyclerView.ItemDecoration {

        private int span;
        private int space;
        private boolean include;

        public GridSpacingdecoration(int span, int space, boolean include) {
            this.span = span;
            this.space = space;
            this.include = include;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            int position = parent.getChildAdapterPosition(view);
            int column = position % span;

            if (include) {
                outRect.left = space - column * space / span;
                outRect.right = (column + 1) * space / span;

                if (position < span) {
                    outRect.top = space;
                }
                outRect.bottom = space;
            } else {
                outRect.left = column * space / span;
                outRect.right = space - (column + 1) * space / span;
                if (position >= span) {
                    outRect.top = space;
                }
            }
        }

    }

    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }
}
