/*
 * Copyright (c) 2017-2018 PLACTAL.
 *
 * The MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package io.plactal.eoscommander.ui.push.abiview;

import javax.inject.Inject;

import io.plactal.eoscommander.data.EoscDataManager;
import io.plactal.eoscommander.data.remote.model.abi.EosAbiMain;
import io.plactal.eoscommander.ui.base.BasePresenter;

/**
 * Created by swapnibble on 2018-01-12.
 */

public class MsgInputPresenter extends BasePresenter<MsgInputMvpView> {
    @Inject
    EoscDataManager mDataManager;

    private EosAbiMain mAbiMain;

    @Inject
    public MsgInputPresenter(){
    }

    public void onSetupViewFinished(String aibObjKey){
        mAbiMain = mDataManager.popAbiObject( aibObjKey );

        getMvpView().setupAbiView( mAbiMain );
    }
}
