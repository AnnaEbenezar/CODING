Public Class Form1
    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        'TODO: This line of code loads data into the 'Database2DataSet1.Table1' table. You can move, or remove it, as needed.
        Me.Table1TableAdapter1.Fill(Me.Database2DataSet1.Table1)
        'TODO: This line of code loads data into the 'Database2DataSet.Table1' table. You can move, or remove it, as needed.
        Me.Table1TableAdapter.Fill(Me.Database2DataSet.Table1)

    End Sub

    Private Sub Table1BindingSource_CurrentChanged(sender As Object, e As EventArgs)

    End Sub
End Class
