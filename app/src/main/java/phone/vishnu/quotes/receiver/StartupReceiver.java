/*
 * Copyright (C) 2019 - 2019-2021 Vishnu Sanal. T
 *
 * This file is part of Quotes Status Creator.
 *
 * Quotes Status Creator is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package phone.vishnu.quotes.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import phone.vishnu.quotes.helper.AlarmHelper;
import phone.vishnu.quotes.helper.SharedPreferenceHelper;

public class StartupReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        try {
            if (intent.getAction() != null) {
                if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {

                    SharedPreferenceHelper sharedPreferenceHelper =
                            new SharedPreferenceHelper(context);

                    AlarmHelper.checkAlarm(context, sharedPreferenceHelper.getAlarmString());

                    AlarmHelper.checkWidgetAlarm(context, sharedPreferenceHelper.getWidgetQuote());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
