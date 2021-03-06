package com.saas.saasuser.view;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.saas.saasuser.R;


/**
 * 提示对话框(可以自定义布局)
 * 1，两个选项，顶部是问号图标
 * 2，单个选项
 */
public class Dialog2 extends Dialog {

    public Dialog2(Context context) {
        super(context);
    }

    public Dialog2(Context context, int theme) {
        super(context, theme);
    }

    /**
     * 建造者类
     *
     * @author Administrator
     */
    public static class Builder {
        private Context context;
        private int topImageId;
        private int BackId;
        private int title;
        private int message;
        private Drawable drawable = null;
        private int positiveButtonText;
        private int negativeButtonText;
        private View contentView;
        private OnClickListener positiveButtonClickListener;
        private OnClickListener BackIdClickListener;
        private OnClickListener negativeButtonClickListener;
        private OnClickListener messageonClickListener;

        public Builder(Context context) {
            this.context = context;
        }

        /**
         * 设置顶部图标
         */
        public Builder setTopImage(int id) {
            this.topImageId = id;
            return this;
        }

        /**
         * 设置消息内容
         *
         * @param title
         * @return
         */
        public Builder setTitle(int title) {
            this.title = title;
            return this;
        }

        /**
         * 设置消息内容
         *
         * @param message
         * @return
         */
        public Builder setMessage(int message) {
            this.message = message;


            return this;
        }

        public Builder setDrawable(Drawable drawable_id) {
            this.drawable = drawable_id;
            return this;
        }


        public Builder setContentView(View v) {
            this.contentView = v;
            return this;
        }


        /**
         * 设置积极按钮
         *
         * @param positiveButtonText
         * @param listener
         * @return
         */
        public Builder setPositiveButton(int positiveButtonText,
                                         OnClickListener listener) {
            this.positiveButtonText = positiveButtonText;
            this.positiveButtonClickListener = listener;
            return this;
        }

        public Builder setBackid(int Backid, OnClickListener listener) {
            this.BackId = Backid;
            this.BackIdClickListener = listener;
            return this;
        }



        public Builder setNegativeButton(int negativeButtonText,
                                         OnClickListener listener) {
            this.negativeButtonText = negativeButtonText;
            this.negativeButtonClickListener = listener;
            return this;
        }

        /**
         * 创建一个AlertDialog
         *
         * @return
         */
        public Dialog2 create() {
            LayoutInflater inflater = LayoutInflater.from(context);

            final Dialog2 dialog = new Dialog2(context,
                    R.style.DialogStyle);

            View layout = null;
            if (null != contentView) {
                layout = contentView;
            } else {
                layout = inflater.inflate(R.layout.dialog__view_reg, null);
            }


            // 设置顶部图标
            ImageView top_image = (ImageView) layout.findViewById(R.id.iv_mess);
            if (0 == topImageId) {
                top_image.setVisibility(View.GONE);
            } else {
                top_image.setImageResource(topImageId);
            }

            // 设置内容
            TextView messageView = (TextView) layout.findViewById(R.id.tv_reg_text2);
            if (0 == message) {
                messageView.setVisibility(View.GONE);
            } else {
                messageView.setText(message);

            }
            //
            ImageView mDissms = (ImageView) layout.findViewById(R.id.iv_reg_clean1);
            mDissms.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                    BackIdClickListener.onClick(dialog, DialogInterface.BUTTON_POSITIVE);
                }
            });


            Button sure_text = (Button) layout
                    .findViewById(R.id.btn_determine2);


            sure_text.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    dialog.dismiss();
                    positiveButtonClickListener.onClick(dialog,
                            DialogInterface.BUTTON_POSITIVE);
                }
            });


            Button quit_text = (Button) layout
                    .findViewById(R.id.btn_abandon_reg);

            // quit_text.setText(negativeButtonText);
            quit_text.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    dialog.dismiss();
                    negativeButtonClickListener.onClick(dialog,
                            DialogInterface.BUTTON_NEGATIVE);
                }
            });


            // 设置对话框的视图
            LayoutParams params = new LayoutParams(LayoutParams.WRAP_CONTENT,
                    LayoutParams.WRAP_CONTENT);
            dialog.setContentView(layout, params);
            return dialog;
        }
    }
}
