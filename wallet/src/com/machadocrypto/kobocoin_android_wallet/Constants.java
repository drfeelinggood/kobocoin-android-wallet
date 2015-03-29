/*
 * Copyright 2011-2014 the original author or authors.
 *
 * This program is free software: you can redistribute it and/or modify
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

package com.machadocrypto.kobocoin_android_wallet;

import java.io.File;
import java.nio.charset.Charset;

import android.os.Build;
import android.os.Environment;
import android.text.format.DateUtils;

import com.machadocrypto.kobocoinj.core.NetworkParameters;
import com.machadocrypto.kobocoinj.params.MainNetParams;

import com.machadocrypto.kobocoin_android_wallet.R;

/**
 * @author Andreas Schildbach
 */
public class Constants
{
	public static final boolean TEST = R.class.getPackage().getName().contains("_test");

	public static final NetworkParameters NETWORK_PARAMETERS = MainNetParams.get();

	public static final String WALLET_FILENAME_PROTOBUF = "wallet-protobuf";

	public static final String WALLET_KEY_BACKUP_BASE58 = "key-backup-base58";
	public static final String WALLET_KEY_BACKUP_PROTOBUF = "key-backup-protobuf";

	public static final File EXTERNAL_WALLET_BACKUP_DIR = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
	public static final String EXTERNAL_WALLET_KEY_BACKUP = "kobocoin-wallet-keys";
	public static final String EXTERNAL_WALLET_BACKUP = "kobocoin-wallet-backup";

	public static final long BACKUP_MAX_CHARS = 5000000;

	public static final String BLOCKCHAIN_FILENAME = "blockchain";
	public static final String VALID_HASHES_FILENAME = "validhashes";
	public static final String PEERS_FILENAME = "peers";
	public static final String CHECKPOINTS_FILENAME = "checkpoints";

	public static final String EXPLORE_BASE_URL = "http://dns1.kobocoin.com:8080/";

	public static final String MIMETYPE_TRANSACTION = "application/x-kobotx";
	public static final String MIMETYPE_WALLET_BACKUP = "application/x-kobocoin-wallet-backup";

	public static final int MAX_NUM_CONFIRMATIONS = 10;
	public static final String USER_AGENT = "Kobocoin Wallet";
	public static final String DEFAULT_EXCHANGE_CURRENCY = "USD";
	public static final int WALLET_OPERATION_STACK_SIZE = 256 * 1024;
	public static final long BLOCKCHAIN_STATE_BROADCAST_THROTTLE_MS = DateUtils.SECOND_IN_MILLIS;
	public static final long BLOCKCHAIN_UPTODATE_THRESHOLD_MS = DateUtils.HOUR_IN_MILLIS;

	public static final String CURRENCY_CODE_KOBO = "KOBO";
	public static final String CURRENCY_CODE_MKOBO = "mKOBO";
	public static final String CURRENCY_CODE_UKOBO = "µKOBO";
	public static final char CHAR_HAIR_SPACE = '\u200a';
	public static final char CHAR_THIN_SPACE = '\u2009';
	public static final char CHAR_ALMOST_EQUAL_TO = '\u2248';
	public static final char CHAR_CHECKMARK = '\u2713';
	public static final String CURRENCY_PLUS_SIGN = "+" + CHAR_THIN_SPACE;
	public static final String CURRENCY_MINUS_SIGN = "-" + CHAR_THIN_SPACE;
	public static final String PREFIX_ALMOST_EQUAL_TO = Character.toString(CHAR_ALMOST_EQUAL_TO) + CHAR_THIN_SPACE;
	public static final int ADDRESS_FORMAT_GROUP_SIZE = 4;
	public static final int ADDRESS_FORMAT_LINE_SIZE = 12;

	public static final int KOBO_MAX_PRECISION = 6;
	public static final int MKOBO_MAX_PRECISION = 3;
	public static final int UKOBO_MAX_PRECISION = 0;
	public static final int LOCAL_PRECISION = 4;

	public static final String DONATION_ADDRESS = "FNbTYcs2xfFkrJT2eTzWDu15freq8ZJ8qK";
	public static final String REPORT_EMAIL = "dev@kobocoin.com";
	public static final String REPORT_SUBJECT_ISSUE = "Reported issue";
	public static final String REPORT_SUBJECT_CRASH = "Crash report";

	public static final String LICENSE_URL = "http://www.gnu.org/licenses/gpl-3.0.txt";
	public static final String SOURCE_URL = "https://github.com/machado-rev/kobocoin-android-wallet";
	public static final String BINARY_URL = "https://github.com/machado-rev/kobocoin-android-wallet/releases";
	public static final String CREDITS_KOBOCOINJ_URL = "https://github.com/machado-rev/kobocoinj";
	public static final String CREDITS_ZXING_URL = "https://github.com/zxing/zxing";
	public static final String AUTHOR_TWITTER_URL = "https://twitter.com/#!/leandrogmachado";
	public static final String MARKET_APP_URL = "market://details?id=%s";
	public static final String WEBMARKET_APP_URL = "https://play.google.com/store/apps/details?id=%s";
	public static final String MARKET_PUBLISHER_URL = "market://search?q=pub:\"Leandro+Machado\"";

	public static final String VERSION_URL = "";
	public static final int HTTP_TIMEOUT_MS = 15 * (int) DateUtils.SECOND_IN_MILLIS;

	public static final long LAST_USAGE_THRESHOLD_JUST_MS = DateUtils.HOUR_IN_MILLIS;
	public static final long LAST_USAGE_THRESHOLD_RECENTLY_MS = 2 * DateUtils.DAY_IN_MILLIS;

	public static final int SDK_JELLY_BEAN = 16;
	public static final int SDK_JELLY_BEAN_MR2 = 18;

	public static final int SDK_DEPRECATED_BELOW = Build.VERSION_CODES.ICE_CREAM_SANDWICH;

	public static final boolean BUG_OPENSSL_HEARTBLEED = Build.VERSION.SDK_INT == Constants.SDK_JELLY_BEAN
			&& Build.VERSION.RELEASE.startsWith("4.1.1");

	public static final int MEMORY_CLASS_LOWEND = 48;

	public static final Charset UTF_8 = Charset.forName("UTF-8");
	public static final Charset US_ASCII = Charset.forName("US-ASCII");
}
