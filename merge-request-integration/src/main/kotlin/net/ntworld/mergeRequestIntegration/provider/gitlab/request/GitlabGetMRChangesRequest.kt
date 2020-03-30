package net.ntworld.mergeRequestIntegration.provider.gitlab.request

import net.ntworld.foundation.Request
import net.ntworld.mergeRequest.api.ApiCredentials
import net.ntworld.mergeRequestIntegration.provider.gitlab.GitlabRequest
import net.ntworld.mergeRequestIntegration.provider.gitlab.response.GitlabGetMRChangesResponse

data class GitlabGetMRChangesRequest(
    override val credentials: ApiCredentials,
    val mergeRequestInternalId: Int
): GitlabRequest, Request<GitlabGetMRChangesResponse>