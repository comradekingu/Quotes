/*
 * Copyright (C) 2019 - 2021 Vishnu Sanal. T
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

package phone.vishnu.quotes.acra;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.auto.service.AutoService;
import org.acra.config.CoreConfiguration;
import org.acra.sender.ReportSender;
import org.acra.sender.ReportSenderFactory;

@AutoService(ReportSenderFactory.class)
public class ACRAFactory implements ReportSenderFactory {

    public ACRAFactory() {}

    @NonNull
    @Override
    public ReportSender create(
            @NonNull Context context, @NonNull CoreConfiguration coreConfiguration) {
        return new ACRASender();
    }
}
