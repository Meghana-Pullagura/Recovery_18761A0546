package com.example.recycler_18761a0546;

        import androidx.annotation.NonNull;
        import androidx.appcompat.app.AppCompatActivity;
        import androidx.recyclerview.widget.RecyclerView;

        import android.os.Bundle;
        import android.view.View;
        import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    int images[];
    String names[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler1);
        setData();
    }


            private void setData() {
                String[] names={"image1","image2","image3","image4","image5","image6","image7","image8","image9","image10"};
                 int[] images={R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,R.drawable.image5,R.drawable.image6,R.drawable.image7,R.drawable.image8,R.drawable.image9,R.drawable.image10};


            }
            class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewInfo>{

                @NonNull
                @Override
                public com.example.recycler_18761a0546.MainActivity.MyAdapter.ViewInfo onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                    return null;
                }

                @Override
                public void onBindViewHolder(@NonNull com.example.recycler_18761a0546.MainActivity.MyAdapter.ViewInfo holder, int position) {

                }

                @Override
                public int getItemCount() {
                    return 0;
                }

                public class ViewInfo extends RecyclerView.ViewHolder {
                    public ViewInfo(@NonNull View itemView) {
                        super(itemView);
                    }
                }
            }






        }

    class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewInfo>{

        @NonNull
        @Override
        public ViewInfo onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return null;
        }

        @Override
        public void onBindViewHolder(@NonNull ViewInfo holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }

        public class ViewInfo extends RecyclerView.ViewHolder {
            public ViewInfo(@NonNull View itemView) {
                super(itemView);
            }
        }
    }
