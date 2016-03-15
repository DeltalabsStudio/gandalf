/**
 * Copyright 2016 Bryan Kelly
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package io.github.btkelly.gandalf.holders;

import android.content.Context;
import android.support.annotation.StringRes;

import io.github.btkelly.gandalf.R;

/**
 * Holds strings that will be displayed in the AlertDialog built by BootstrapDialogUtil
 */
public class DialogStringsHolder {

    private Context context;
    private String updateAvailableTitle;
    private String updateRequiredTitle;
    private String alertTitle;
    private String downloadUpdateButton;
    private String skipUpdateButton;
    private String closeAppButton;
    private String okButton;

    public DialogStringsHolder(Context context) {
        this.context = context;
        setUpdateAvailableTitle(R.string.update_available_title);
        setUpdateRequiredTitle(R.string.update_required_title);
        setDownloadUpdateButtonText(R.string.download_update_button);
        setSkipUpdateButtonText(R.string.skip_update_button);
        setCloseAppButtonText(R.string.close_app_button);
        setAlertTitle(R.string.alert_title);
        setOkButtonText(R.string.ok_button);
    }

    public String getUpdateAvailableTitle() {
        return updateAvailableTitle;
    }

    public String getUpdateRequiredTitle() {
        return updateRequiredTitle;
    }

    public String getAlertTitle() {
        return alertTitle;
    }

    public String getDownloadUpdateButtonText() {
        return downloadUpdateButton;
    }

    public String getSkipUpdateButtonText() {
        return skipUpdateButton;
    }

    public String getCloseAppButtonText() {
        return closeAppButton;
    }

    public String getOkButtonText() {
        return okButton;
    }

    public void setUpdateAvailableTitle(@StringRes int updateAvailableTitle) {
        this.updateAvailableTitle = context.getResources().getString(updateAvailableTitle);
    }

    public void setUpdateAvailableTitle(String updateAvailableTitle) {
        this.updateAvailableTitle = updateAvailableTitle;
    }

    public void setUpdateRequiredTitle(@StringRes int updateRequiredTitle) {
        this.updateRequiredTitle = context.getResources().getString(updateRequiredTitle);
    }

    public void setUpdateRequiredTitle(String updateRequiredTitle) {
        this.updateRequiredTitle = updateRequiredTitle;
    }

    public void setDownloadUpdateButtonText(@StringRes int downloadUpdateButton) {
        this.downloadUpdateButton = context.getResources().getString(downloadUpdateButton);
    }

    public void setDownloadUpdateButtonText(String downloadUpdateButton) {
        this.downloadUpdateButton = downloadUpdateButton;
    }

    public void setSkipUpdateButtonText(@StringRes int skipUpdateButton) {
        this.skipUpdateButton = context.getResources().getString(skipUpdateButton);
    }

    public void setSkipUpdateButtonText(String skipUpdateButton) {
        this.skipUpdateButton = skipUpdateButton;
    }

    public void setCloseAppButtonText(@StringRes int closeAppButton) {
        this.closeAppButton = context.getResources().getString(closeAppButton);
    }

    public void setCloseAppButtonText(String closeAppButton) {
        this.closeAppButton = closeAppButton;
    }

    public void setAlertTitle(@StringRes int alertTitle) {
        this.alertTitle = context.getResources().getString(alertTitle);
    }

    public void setAlertTitle(String alertTitle) {
        this.alertTitle = alertTitle;
    }

    public void setOkButtonText(@StringRes int okButton) {
        this.okButton = context.getResources().getString(okButton);
    }

    public void setOkButtonText(String okButton) {
        this.okButton = okButton;
    }
}
