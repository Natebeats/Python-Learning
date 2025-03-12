package posts.post;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EinTweetController {

    private  EinTweetView view;
    private  String tweetText;
    private  String email;
    private  Date datum;
    private  boolean meinTweet;

    private EinTweetController(){}

    public EinTweetController(String text, String email, Date datum, boolean meinTweet) {
        this.view = new EinTweetView();
        this.tweetText = text;
        this.email = email ;
        this.datum = datum;
        this.meinTweet = meinTweet;
        initView();
    }

    private void initView() {
        JLabel tweetLabel = view.getLabel1();
        JLabel dateLabel = view.getLabel2();
        JLabel emailLabel = view.getLabel3();

        tweetLabel.setText(tweetText);
        emailLabel.setText(email);
        dateLabel.setText(createTextFromDate(datum));
        if(meinTweet){
            view.getPanel1().setBackground(Color.GREEN);
            emailLabel.setText("");
            tweetLabel.setHorizontalAlignment(SwingConstants.LEFT);
        } else {
            view.getPanel1().setBackground(Color.yellow);
            tweetLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        }
    }

    private synchronized  String createTextFromDate(Date datum) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        return sdf.format(datum);
    }


    public JPanel getView() {
        return view.getPanel1();
    }

}
