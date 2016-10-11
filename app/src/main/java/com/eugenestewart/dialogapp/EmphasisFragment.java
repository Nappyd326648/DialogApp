package com.eugenestewart.dialogapp;


import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;

/**
 * Created by nappy on 10/3/2016.
 */

public class EmphasisFragment extends DialogFragment {

    final CharSequence [] EMPHASIS_CHOICES ={"Capitation","Insert Exclamation mark","Insert Smiley"};
    final boolean [] checked={};
    final int [] EMPHASIS_VALUE = {};


    public interface EmphasisDialogSelectionListener {
        void emphasisSelected(int emphasis);
    }
    private EmphasisDialogSelectionListener mListener;

    public  static  EmphasisFragment newInstance(){
        EmphasisFragment fragment = new EmphasisFragment();
        return fragment;
    }
    @Override
    public void onAttach(Activity activity){
        super.onAttach(activity);
        if (activity instanceof  EmphasisDialogSelectionListener){
            mListener= (EmphasisDialogSelectionListener) activity;
        }else {
            throw new  RuntimeException(activity.toString()+ "must implement ColorDialogS");
        }
    }
    @Override
    public Dialog onCreateDialog(Bundle savedInsanceState){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Choose a Emphasis")
                .setMultiChoiceItems(EMPHASIS_CHOICES, checked, new DialogInterface.OnMultiChoiceClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                        
                    }
                });

        return builder.create();
    }
}




