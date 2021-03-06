package net.ntworld.mergeRequestIntegrationIde.component.comment

import com.intellij.openapi.project.Project as IdeaProject
import net.ntworld.mergeRequest.Comment
import net.ntworld.mergeRequest.MergeRequestInfo
import net.ntworld.mergeRequest.ProviderData
import net.ntworld.mergeRequestIntegrationIde.component.comment.*

object ComponentFactory {

    fun makeGroup(
        providerData: ProviderData,
        mergeRequestInfo: MergeRequestInfo,
        ideaProject: IdeaProject,
        borderTop: Boolean,
        groupId: String,
        comments: List<Comment>,
        borderLeftRight: Int = 1,
        showMoveToDialog: Boolean = true
    ) : GroupComponent {
        return GroupComponentImpl(
            borderTop,
            providerData,
            mergeRequestInfo,
            ideaProject,
            groupId,
            comments,
            borderLeftRight,
            showMoveToDialog
        )
    }

    fun makeComment(
        groupComponent: GroupComponent,
        providerData: ProviderData,
        mergeRequestInfo: MergeRequestInfo,
        comment: Comment,
        indent: Int,
        borderLeftRight: Int = 1,
        showMoveToDialog: Boolean = true
    ): CommentComponent {
        return CommentComponentImpl(
            groupComponent,
            providerData,
            mergeRequestInfo,
            comment,
            indent,
            borderLeftRight,
            showMoveToDialog
        )
    }

    fun makeEditor(
        ideaProject: IdeaProject,
        type: EditorComponent.Type,
        indent: Int,
        borderLeftRight: Int = 1,
        showCancelAction: Boolean = true
    ): EditorComponent {
        return EditorComponentImpl(
            ideaProject,
            type,
            indent,
            borderLeftRight,
            showCancelAction
        )
    }
}