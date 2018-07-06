package client.imtiazabir.com.githubclient.flow.repository_list

import client.imtiazabir.com.githubclient.model.Repository
import client.imtiazabir.com.githubclient.mvp.BaseMvpPresenter
import client.imtiazabir.com.githubclient.mvp.BaseMvpView


object RepositoriesContract {

    interface View : BaseMvpView {
        fun showOrganizations(repositories: MutableList<Repository>)

    }

    interface Presenter : BaseMvpPresenter<View> {
        fun loadRepositories()

    }


}
