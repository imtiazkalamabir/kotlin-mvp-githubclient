package client.imtiazabir.com.githubclient.flow.repository

import client.imtiazabir.com.githubclient.api.GeneralErrorHandler
import client.imtiazabir.com.githubclient.manager.ApiManager
import client.imtiazabir.com.githubclient.mvp.BaseMvpPresenterImpl
import rx.functions.Action1


class RepositoryDetailsPresenter : BaseMvpPresenterImpl<RepositoryDetailsContract.View>(),
        RepositoryDetailsContract.Presenter {

    companion object {
        private const val ORGANIZATION_NAME = "imtiazkalamabir"
    }

    override fun loadRepository(name: String) {
        ApiManager.loadRepository(ORGANIZATION_NAME, name)
                .subscribe(Action1 { mView?.showRepository(it) },
                        GeneralErrorHandler(mView, true,
                                { throwable, errorBody, isNetwork -> mView?.showReloadButton() }))
    }
}