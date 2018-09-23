package karthik.www.notekeeper

class CourseInfo (val courseId: String, val title: String) {
    override fun toString(): String {
        return courseId
    }
}

class NoteInfo (var course: CourseInfo, var title: String, var text: String)

