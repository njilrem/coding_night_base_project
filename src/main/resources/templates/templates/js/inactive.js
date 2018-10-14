document.addEventListener('DOMContentLoaded', add_questions_for_vote);

function add_questions_for_vote() {
    for (var i = 0; i < 10; i++) {
        var question = document.createElement("li");
        question.id = 'question' + i;
        // question.classList.add("list-group-item");
        question.innerHTML = '' +
            '<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Odio ducimus consectetur culpa deserunt error, beatae esse id molestiae mollitia commodi dignissimos distinctio unde amet fuga doloribus corrupti tempore velit sint?\n</p>';

        question.addEventListener('click', function () {
                list_click(this);
            }
        );
        document.getElementById("questions").appendChild(question);
    }
    document.getElementById("question-loader").removeEventListener('click', add_questions_for_vote);
    console.log(document.getElementById("question-loader"));
}