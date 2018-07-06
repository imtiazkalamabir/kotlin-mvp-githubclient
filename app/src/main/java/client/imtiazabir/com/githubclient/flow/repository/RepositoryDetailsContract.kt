package client.imtiazabir.com.githubclient.flow.repository

import client.imtiazabir.com.githubclient.model.RepositoryDetail
import client.imtiazabir.com.githubclient.mvp.BaseMvpPresenter
import client.imtiazabir.com.githubclient.mvp.BaseMvpView


object RepositoryDetailsContract {

    interface View : BaseMvpView {
        fun showRepository(repositoryDetail: RepositoryDetail)

        fun showReloadButton()
    }

    interface Presenter : BaseMvpPresenter<View> {
        fun loadRepository(name: String)
    }


}