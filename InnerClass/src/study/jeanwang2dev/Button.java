package study.jeanwang2dev;

public class Button {

    private String title;
    private OnClickListener onClickListener;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        System.out.println(this.title + " button was attached");
        this.onClickListener = onClickListener;
    }

    public void onClick(){
        this.onClickListener.onClick(this.title);
    }

    interface OnClickListener{
        void onClick(String title);
    }
}
